package com.wang.myspring.context.annotation;

import cn.hutool.core.util.StrUtil;
import com.wang.myspring.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import com.wang.myspring.beans.factory.config.BeanDefinition;
import com.wang.myspring.beans.factory.support.BeanDefinitionRegistry;
import com.wang.myspring.stereotype.Component;

import java.util.Set;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/23:30
 */
public class ClassPathBeanDefinitionScanner extends ClassPathScanningCandidateComponentProvider {

    private BeanDefinitionRegistry registry;

    public static final String AUTOWIRED_ANNOTATION_PROCESSOR_BEAN_NAME = "com.wang.myspring.context.annotation.internalAutowiredAnnotationProcessor";

    public ClassPathBeanDefinitionScanner(BeanDefinitionRegistry beanDefinitionRegistry) {
        this.registry = beanDefinitionRegistry;
    }

    public void doScan(String... basePackages) {
        for (String basePackage : basePackages) {
            Set<BeanDefinition> candidates = findCandidateComponents(basePackage);
            for (BeanDefinition candidate : candidates) {
                // 解析bean的作用域
                String beanScope = resolveBeanScope(candidate);
                if (StrUtil.isNotEmpty(beanScope)) {
                    candidate.setScope(beanScope);
                }
                //生成bean的名称
                String beanName = determineBeanName(candidate);
                //注册BeanDefinition
                registry.registerBeanDefinition(beanName, candidate);
            }
        }
        //注册处理@Autowired和@Value注解的BeanPostProcessor
        registry.registerBeanDefinition(AUTOWIRED_ANNOTATION_PROCESSOR_BEAN_NAME, new BeanDefinition(AutowiredAnnotationBeanPostProcessor.class));
    }
    /**
     * 获取bean的作用域
     *
     * @param beanDefinition
     * @return
     */
    private String resolveBeanScope(BeanDefinition beanDefinition) {
        Class<?> beanClass = beanDefinition.getBeanClazz();
        Scope scope = beanClass.getAnnotation(Scope.class);
        if (scope != null) {
            return scope.value();
        }

        return StrUtil.EMPTY;
    }


    /**
     * 生成bean的名称
     *
     * @param beanDefinition
     * @return
     */
    private String determineBeanName(BeanDefinition beanDefinition) {
        Class<?> beanClass = beanDefinition.getBeanClazz();
        Component component = beanClass.getAnnotation(Component.class);
        String value = component.value();
        if (StrUtil.isEmpty(value)) {
            value = StrUtil.lowerFirst(beanClass.getSimpleName());
        }
        return value;
    }

}
