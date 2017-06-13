package com.mebitech.samples.quickstart.web.myapp.Encapsulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Diagram on 27/05/2017.
 */
public class EncapOne {
    /*
    * pr'vate değişken ve metodlara sadece sınıf içerisinden erişilir
    * public her yer
    * protected o paket ve alt paketler
    * */

    private String deneme(){
        return "deneme private";
    }
    private List<String> strings = new ArrayList<>();

    public String deger = "public deger";

    public Float sayiDondur(){
        float number = 5;
        return number;
    }

    protected Double sayi = 2.13;

    protected Map map(){
        Map<String,String> stringStringMap = new HashMap<>();
        stringStringMap.put("anne","zeynep");
        stringStringMap.put("baba","menderes");
        stringStringMap.put("kardeş","yunus emre");
        stringStringMap.put("arkadaş","serkan ekinci");
        return stringStringMap;
    }
}
