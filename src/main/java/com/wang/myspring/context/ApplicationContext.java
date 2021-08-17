package com.wang.myspring.context;

import com.wang.myspring.beans.factory.HierarchicalBeanFactory;
import com.wang.myspring.beans.factory.ListableBeanFactory;
import com.wang.myspring.core.io.ResourceLoader;

/**
 * @Description: 应用上下文
 * @Author: wht
 * @Date: 2021/08/03/12:41
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
