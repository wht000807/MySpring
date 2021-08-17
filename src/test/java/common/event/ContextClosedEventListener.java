package common.event;

import com.wang.myspring.context.ApplicationListener;
import com.wang.myspring.context.event.ContextClosedEvent;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/11:54
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println(this.getClass().getName());
    }
}
