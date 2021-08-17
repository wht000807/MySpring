package com.wang.myspring.beans.factory;

/**
 * @Description: 父子级联 IoC 容器的接口，子容器可以通过接口方法访问父容器，但父容器不能访问子容器的 Bean
 * @Author: wht
 * @Date: 2021/08/02/22:02
 */
public interface HierarchicalBeanFactory extends BeanFactory{
}
