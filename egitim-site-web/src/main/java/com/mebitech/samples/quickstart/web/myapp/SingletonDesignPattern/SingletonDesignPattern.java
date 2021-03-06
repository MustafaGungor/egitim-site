package com.mebitech.samples.quickstart.web.myapp.SingletonDesignPattern;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 24/05/2017.
 */
public class SingletonDesignPattern {
    private static SingletonDesignPattern singletonDesignPattern = new SingletonDesignPattern();

    public SingletonDesignPattern() {
        System.out.println("singleton yalnız birkez üretiliyor bellekte hafızada tutuluyor");
    }
    public static SingletonDesignPattern getObject(){
        return singletonDesignPattern;
    }
    public String getName(String name){
        return name;
    }
    public String getPassword(String password){
        return password;
    }
}
