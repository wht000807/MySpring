package com.wang.myspring.beans.factory.support;

import com.wang.myspring.beans.BeansException;
import com.wang.myspring.beans.factory.config.BeanDefinition;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/02/19:34
 */
public class CgLibSubclassingInstantiationStrategy implements InstantiationStrategy{

    /**
     * 使用CGLIB动态生成子类
     *
     * @param beanDefinition
     * @return
     * @throws BeansException
     */

    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        throw new UnsupportedOperationException("CGLIB instantiation strategy is not supported");
    }
}
