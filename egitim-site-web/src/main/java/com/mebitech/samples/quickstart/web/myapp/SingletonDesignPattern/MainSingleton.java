package com.mebitech.samples.quickstart.web.myapp.SingletonDesignPattern;

/**
 * Created by Diagram on 24/05/2017.
 */
public class MainSingleton {
    public static void main(String[] args) {
        final String name = SingletonDesignPattern.getObject().getName("mustafa");
        String password = SingletonDesignPattern.getObject().getPassword("XcTyHha");
        System.out.println(name);
        System.out.println(password);
    }
}
