package com.wang.myspring.beans.factory.support;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.config.BeanDefinition;

/**
 * @Description: Bean的实例化策略
 * @Author: wht
 * @Date: 2021/08/02/19:28
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
