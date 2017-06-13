package com.mebitech.samples.quickstart.web.myapp.EnumValue;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 27/05/2017
 */
enum Iller {
    KONYA,ANKARA,KUTAHYA,IZMIR
}
enum IllerMesafe {
    KONYA(350),ANKARA(60),KUTAHYA(360),IZMIR(520);
    public int hiz;
    IllerMesafe(int hiz){
        this.hiz = hiz;
    }
}
public class EnumIl {
    public static void main(String[] args) {
        System.out.println(Iller.ANKARA);
        System.out.println(IllerMesafe.IZMIR.hiz);
    }
}
