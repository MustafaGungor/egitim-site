package com.mebitech.samples.quickstart.web.myapp.General;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 27/05/2017.
 */
public class IntegralMain {
    public static void main(String[] args) {
        Integral integral = new Integral(40,50,6,7,80,1);
        double i = integral.hesapla();
        System.out.println(i);
    }
}
