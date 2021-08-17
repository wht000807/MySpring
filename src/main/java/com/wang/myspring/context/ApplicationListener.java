package com.wang.myspring.context;

import java.util.EventListener;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/10:54
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
