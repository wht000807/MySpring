package com.wang.myspring.beans;

/**
 * @author wht
 * @date 2021/8/2
 */

public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg, cause);
    }
}
