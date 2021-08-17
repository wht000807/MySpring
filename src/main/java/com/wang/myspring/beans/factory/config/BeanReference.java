package com.wang.myspring.beans.factory.config;

/**
 * @Description: 一个bean对另一个bean的引用
 * @Author: wht
 * @Date: 2021/08/02/20:41
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
