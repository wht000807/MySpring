package com.wang.myspring.beans.factory.config;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Description: 允许自定义修改BeanDefinition的属性值
 * @Author: wht
 * @Date: 2021/08/03/12:02
 */
public interface BeanFactoryPostProcessor {
    /**
     * 在所有BeanDefinition加载完成后，但在bean实例化之前，提供修改BeanDefinition属性值的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
