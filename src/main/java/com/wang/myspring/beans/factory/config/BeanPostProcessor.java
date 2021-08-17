package com.wang.myspring.beans.factory.config;

import com.wang.myspring.beans.BeansException;

/**
 * @Description: 用于修改实例化后的bean的修改扩展点
 * @Author: wht
 * @Date: 2021/08/03/10:01
 */
public interface BeanPostProcessor {

    /**
     * 在bean执行初始化方法之前执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在bean执行初始化方法之后执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;


}