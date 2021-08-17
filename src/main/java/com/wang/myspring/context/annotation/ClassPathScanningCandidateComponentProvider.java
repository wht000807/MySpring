package com.wang.myspring.context.annotation;

import cn.hutool.core.util.ClassUtil;
import com.wang.myspring.beans.factory.config.BeanDefinition;
import com.wang.myspring.stereotype.Component;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/23:30
 */
public class ClassPathScanningCandidateComponentProvider {
    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        // 扫描有org.springframework.stereotype.Component注解的类
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            BeanDefinition beanDefinition = new BeanDefinition(clazz);
            candidates.add(beanDefinition);
        }
        return candidates;
    }
}
