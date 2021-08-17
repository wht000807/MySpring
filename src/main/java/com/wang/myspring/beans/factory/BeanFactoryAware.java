package com.wang.myspring.beans.factory;

import com.wang.myspring.beans.BeansException;

/**
 * @Description: 实现该接口，能感知所属BeanFactory
 * @Author: wht
 * @Date: 2021/08/04/0:02
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
