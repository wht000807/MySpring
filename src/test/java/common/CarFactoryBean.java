package common;

import bean.Car;
import com.wang.myspring.beans.factory.FactoryBean;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/04/0:56
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String brand;

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        car.setBrand(brand);
        return car;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
