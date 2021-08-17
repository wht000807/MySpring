package aop;

import com.wang.myspring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import service.WorldService;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/21:08
 */
public class AutoProxyTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:auto-proxy.xml");

        //获取代理对象
        WorldService worldService = applicationContext.getBean("worldService", WorldService.class);
        worldService.explode();

    }
}
