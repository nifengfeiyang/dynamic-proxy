package com.szm;

import java.lang.reflect.Proxy;

public class App {
    public static void  main(String[] args){
        //1.通过匿名内部类方式完成动态代理
        IVehical proxyCar = (IVehical) Proxy.newProxyInstance(App.class.getClassLoader(),Car.class.getInterfaces(),(proxy, method, args1) -> {
            System.out.println("动态代理的汽车也会跑！！！");

            return "proxy Car";
        });

        proxyCar.run();

        //通过外部类实现，同时对原有的实现类进行了包装
        IVehical proxyCar2 = (IVehical) Proxy.newProxyInstance(App.class.getClassLoader(),Car.class.getInterfaces(),new VehicalInvacationHandler(new Car()));
        proxyCar2.run();
    }
}
