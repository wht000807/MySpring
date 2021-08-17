package com.wang.myspring.beans;

/**
 * @Description: bean属性信息
 * @Author: wht
 * @Date: 2021/08/02/19:40
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
