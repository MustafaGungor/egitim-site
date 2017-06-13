package com.mebitech.samples.quickstart.web.myapp.Abstraction;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see SekilMain
 */
public class SekilMain extends SekilAbstract {

    @Override
    public void Alan(int deger) {
        System.out.println(deger*deger);
    }

    @Override
    public void Cevre(int deger) {
        System.out.println(deger*2);
    }
}
