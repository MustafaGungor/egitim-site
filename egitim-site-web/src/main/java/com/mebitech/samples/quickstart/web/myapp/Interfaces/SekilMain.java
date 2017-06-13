package com.mebitech.samples.quickstart.web.myapp.Interfaces;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 05/06/2017.
 */
public class SekilMain implements SekilInterface {
    /**
     * iki farklı kenarı olan düz şekiller için Alan hesaplayan method
     * @param kisaKenar
     * @param uzunKenar
     */
    @Override
    public void Alan(int kisaKenar, int uzunKenar) {
        System.out.println("Alan : " + (kisaKenar * uzunKenar));
    }

    /**
     * Normal kare için alan hesaplayan method
     * @param kenar
     */
    @Override
    public void Alan(int kenar) {
        System.out.println("Alan : " + Math.pow(kenar,2));
    }

    /**
     * iki farklı kenarı olan düz şekiller için Cevre hesaplayan method
     * @param kisaKenar
     * @param uzunKenar
     */
    @Override
    public void Cevre(int kisaKenar, int uzunKenar) {
        System.out.println("Çevre : " + 2*(kisaKenar+uzunKenar));
    }

    /**
     * Bütün kenarları aynı olan şekiller için Cevre hesabı
     * @param kenar
     */
    @Override
    public void Cevre(int kenar) {
        System.out.println("Çevre : " + 4*kenar);
    }

    /**
     * Şekil adını return eden fonksiyon
     * @param name
     * @return String
     */
    @Override
    public String SekilAdi(String name) {
        return name;
    }
}
