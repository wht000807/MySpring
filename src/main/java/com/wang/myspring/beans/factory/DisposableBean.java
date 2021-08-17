package com.wang.myspring.beans.factory;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/03/22:20
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
