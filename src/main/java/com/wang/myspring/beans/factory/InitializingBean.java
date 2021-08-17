package com.wang.myspring.beans.factory;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/03/22:08
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
