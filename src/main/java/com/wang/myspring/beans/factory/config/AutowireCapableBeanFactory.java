package com.wang.myspring.beans.factory.config;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.BeanFactory;

/**
 * @Description: 装配applicationContext管理之外的Bean
 * @Author: wht
 * @Date: 2021/08/02/21:58
 */

public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行BeanPostProcessors的postProcessBeforeInitialization方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行BeanPostProcessors的postProcessAfterInitialization方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;



}
