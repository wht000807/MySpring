package com.wang.myspring.context.event;

import com.wang.myspring.context.ApplicationContext;
import com.wang.myspring.context.ApplicationEvent;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/10:56
 */
public abstract class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
