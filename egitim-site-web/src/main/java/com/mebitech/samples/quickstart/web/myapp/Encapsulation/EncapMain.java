package com.mebitech.samples.quickstart.web.myapp.Encapsulation;

import java.util.Map;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 */
public class EncapMain {
    public static void main(String[] args) {
        EncapOne encapOne = new EncapOne();
        //public degisken
        System.out.println(encapOne.deger);
        //public metod
        Float sayi = encapOne.sayiDondur();
        System.out.println(sayi);
        //protected Değişken
        System.out.println(encapOne.sayi);
        //protected metod
        Map<String,String> stringMap = encapOne.map();
        System.out.println(stringMap);
    }
}
