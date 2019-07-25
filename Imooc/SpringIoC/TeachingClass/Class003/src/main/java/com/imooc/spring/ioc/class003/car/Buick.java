package com.imooc.spring.ioc.class003.car;

public class Buick implements Car {

    public void start() {
        System.out.println("Buick.start");
    }

    public void turnLeft() {
        System.out.println("Buick.turnLeft");
    }

    public void turnRight() {
        System.out.println("Buick.turnRight");
    }

    public void stop() {
        System.out.println("Buick.stop");
    }
}
