package com.imooc.spring.ioc.class003.human;

import com.imooc.spring.ioc.class003.car.Car;

public class ZhangSan extends HumanWithCar {

    public ZhangSan(Car car) {
        super(car);
    }

    @Override
    public void goHome() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
