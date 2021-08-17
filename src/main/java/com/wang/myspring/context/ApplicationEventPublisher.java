package com.wang.myspring.context;

/**
 * @Description: 事件发布接口
 * @Author: wht
 * @Date: 2021/08/04/10:53
 */
public interface ApplicationEventPublisher {

    /**
     * 发布事件
     * @param event
     */
    void publishEvent(ApplicationEvent event);
}
