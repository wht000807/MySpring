package com.wang.myspring.beans.factory.config;

/**
 * @Description: 单例注册表
 * @Author: wht
 * @Date: 2021/08/02/17:15
 */
public interface SingletonBeanRegistry {

    /**
     * 返回一个单例类
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);
}
