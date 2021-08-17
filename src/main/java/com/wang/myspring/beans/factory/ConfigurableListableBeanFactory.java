package com.wang.myspring.beans.factory;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.config.AutowireCapableBeanFactory;
import com.wang.myspring.beans.factory.config.BeanDefinition;
import com.wang.myspring.beans.factory.config.BeanPostProcessor;
import com.wang.myspring.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/02/22:01
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    /**
     * 根据名称查找BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException 如果找不到BeanDefinition
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 提前实例化所有单例实例
     * @throws BeansException
     */
    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);


}
