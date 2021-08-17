package bean;

import com.wang.myspring.beans.factory.annotation.Value;
import com.wang.myspring.stereotype.Component;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/02/20:48
 */
@Component
public class Car {
    @Value("${brand}")
    private String brand;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

}
