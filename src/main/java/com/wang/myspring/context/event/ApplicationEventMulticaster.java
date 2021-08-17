package com.wang.myspring.context.event;

import com.wang.myspring.context.ApplicationEvent;
import com.wang.myspring.context.ApplicationListener;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/10:59
 */
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
