package common.event;

import com.wang.myspring.context.ApplicationListener;
import com.wang.myspring.context.event.ContextRefreshedEvent;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/11:55
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(this.getClass().getName());
    }
}
