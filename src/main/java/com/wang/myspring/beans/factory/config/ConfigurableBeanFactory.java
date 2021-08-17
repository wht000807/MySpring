package com.wang.myspring.beans.factory.config;

import com.wang.myspring.beans.factory.HierarchicalBeanFactory;
import com.wang.myspring.util.StringValueResolver;

/**
 * @Description: 定义BeanFactory的配置。增强了 IoC 容器的可定制性

 * @Author: wht
 * @Date: 2021/08/02/21:58
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory,SingletonBeanRegistry {

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例bean
     */
    void destroySingletons();

    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    String resolveEmbeddedValue(String value);

}
