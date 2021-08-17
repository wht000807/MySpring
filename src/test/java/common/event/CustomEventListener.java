package common.event;

import com.wang.myspring.context.ApplicationListener;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/11:57
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(this.getClass().getName());
    }
}
