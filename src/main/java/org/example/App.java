package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Vehicle vhc = (Vehicle) context.getBean("vhc");
        vhc.drive();
        if (vhc instanceof Car) {
            Car car = (Car) vhc;
            car.getTyre().toString();
        }
    }
}
