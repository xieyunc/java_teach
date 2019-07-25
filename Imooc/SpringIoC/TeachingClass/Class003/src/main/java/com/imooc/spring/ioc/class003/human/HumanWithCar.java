package com.imooc.spring.ioc.class003.human;

import com.imooc.spring.ioc.class003.car.Car;

public abstract class HumanWithCar implements Human {

    protected Car car;

    public HumanWithCar(Car car) {
        this.car = car;
    }

    public abstract void goHome() ;
}
