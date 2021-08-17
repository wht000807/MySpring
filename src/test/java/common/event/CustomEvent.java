package common.event;

import com.wang.myspring.context.event.ApplicationContextEvent;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/11:56
 */
public class CustomEvent extends ApplicationContextEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomEvent(Object source) {
        super(source);
    }
}
