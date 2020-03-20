package com.szm;

public class Car implements IVehical {

    @Override
    public String run() {
        System.out.println("汽车会跑！！！");
        return "car";
    }
}
