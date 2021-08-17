package com.wang.myspring.beans.factory.config;

import com.wang.myspring.beans.PropertyValues;

import java.util.Objects;

/**
 * @Description: BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、是否为单例等，此处简化只包含class类型
 * @Author: wht
 * @Date: 2021/08/02/17:13
 */
public class BeanDefinition {

    public static String SCOPE_SINGLETON = "singleton";

    public static String SCOPE_PROTOTYPE = "prototype";

    private Class beanClazz;

    private PropertyValues propertyValues;

    private String scope = SCOPE_SINGLETON;

    private boolean singleton = true;

    private boolean prototype = false;

    private String initMethodName;

    private String destroyMethodName;

    public BeanDefinition(Class beanClazz) {
        this(beanClazz,null);
    }

    public BeanDefinition(Class beanClazz, PropertyValues propertyValues) {
        this.beanClazz = beanClazz;
        this.propertyValues = propertyValues != null? propertyValues : new PropertyValues();
    }

    public void setScope(String scope) {
        this.scope = scope;
        this.singleton = SCOPE_SINGLETON.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }

    public boolean isSingleton() {
        return this.singleton;
    }

    public boolean isPrototype() {
        return this.prototype;
    }

    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }


    public Class getBeanClazz() {
        return beanClazz;
    }

    public void setBeanClazz(Class beanClazz) {
        this.beanClazz = beanClazz;
    }

    public PropertyValues getPropertyValues() {
        return  propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeanDefinition that = (BeanDefinition) o;
        return beanClazz.equals(that.beanClazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beanClazz);
    }

}
