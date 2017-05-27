package com.mebitech.samples.quickstart.web.myapp.Encapsulation;

import java.util.Map;

/**
 * Created by Diagram on 27/05/2017.
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
