package com.wang.myspring.context;

import java.util.EventObject;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/10:40
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
