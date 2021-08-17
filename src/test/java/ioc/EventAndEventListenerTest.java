package ioc;

import com.wang.myspring.context.support.ClassPathXmlApplicationContext;
import common.event.CustomEvent;
import org.junit.Test;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/11:52
 */
public class EventAndEventListenerTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:event-and-event-listener.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext));

        applicationContext.registerShutdownHook();//或者applicationContext.close()主动关闭容器;
    }
}
