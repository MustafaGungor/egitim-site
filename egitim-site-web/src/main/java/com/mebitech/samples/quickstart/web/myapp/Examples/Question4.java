package com.mebitech.samples.quickstart.web.myapp.Examples;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 04/06/2017.
 */
/**
 * Created by Diagram on 04/06/2017.
 * //////////////////////////////
 * method overload yap
 * ////////////////////////////////
 */
public class Question4 {
    public static String overLoad(String name,String surname){
        return name + " " + surname;
    }
    public static String overLoad(String name, String surname, Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/M/yyyy");
        return name + " " + surname + " " +simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        Date tarih=new Date();
        String method1 = overLoad("mustafa","güngör");
        String method2 = overLoad("mustafa","güngör", tarih);
        System.out.println("method1 2 parametre : " +method1);
        System.out.println("method2 3 parametre : " +method2);

    }
}
