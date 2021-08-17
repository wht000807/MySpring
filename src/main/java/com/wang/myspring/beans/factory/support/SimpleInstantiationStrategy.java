package com.wang.myspring.beans.factory.support;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/02/19:36
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Class beanClazz = beanDefinition.getBeanClazz();

        try {
            Constructor constructor = beanClazz.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new BeansException("Failed to instantiate" + beanClazz.getName(),e);
        }
    }
}
