package com.wang.myspring.context.support;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.config.BeanPostProcessor;
import com.wang.myspring.context.ApplicationContext;
import com.wang.myspring.context.ApplicationContextAware;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/0:17
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
