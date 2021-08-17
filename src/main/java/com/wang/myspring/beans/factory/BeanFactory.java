package com.wang.myspring.beans.factory;

import com.wang.myspring.beans.BeansException;

/**
 * @Description: bean容器，主要的方法就是 getBean，BeanFactory 的功能通过其他的接口得到不断扩展
 * @Author: wht
 * @Date: 2021/08/02/17:21
 */
public interface BeanFactory {

    /**
     *获取bean
     * @param beanName
     * @return
     * @throws BeansException bean不存在时
     */
     Object getBean(String beanName) throws BeansException;

    /**
     * 根据名称和类型查找bean
     * @param name
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
     <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;

}
