package com.mebitech.samples.quickstart.web.myapp.Interfaces;

/**
 * Created by Diagram on 05/06/2017.
 */
public class SekilMain implements SekilInterface {
    @Override
    public void Alan(int kisaKenar, int uzunKenar) {
        System.out.println("Alan : " + (kisaKenar * uzunKenar));
    }

    @Override
    public void Alan(int kenar) {
        System.out.println("Alan : " + Math.pow(kenar,2));
    }

    @Override
    public void Cevre(int kisaKenar, int uzunKenar) {
        System.out.println("Çevre : " + 2*(kisaKenar+uzunKenar));
    }

    @Override
    public void Cevre(int kenar) {
        System.out.println("Çevre : " + 4*kenar);
    }

    @Override
    public String SekilAdi(String name) {
        return name;
    }
}
