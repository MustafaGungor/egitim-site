package com.mebitech.samples.quickstart.web.myapp.General;

/**
 * Created by Diagram on 27/05/2017.
 */
public class IntegralMain {
    public static void main(String[] args) {
        Integral integral = new Integral(40,50,6,7,80,1);
        double i = integral.hesapla();
        System.out.println(i);
    }
}
