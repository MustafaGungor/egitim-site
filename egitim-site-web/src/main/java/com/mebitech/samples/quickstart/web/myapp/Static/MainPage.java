package com.mebitech.samples.quickstart.web.myapp.Static;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 27/05/2017.
 */
public class MainPage {
    /**
     * varsayılan int sayi
     */
    public static int sayi = 5;

    public static void main(String[] args) {
        //Static method ve değişkenlere nesne oluşturmadan direkt ulaşılır.
        System.out.println(staticMethod());
        sayi++;
        System.out.println(sayi);

        //Düz method ve değişkenlere new leyerek ulaşırsın.
        String normalValue = new MainPage().normalMethod();
        System.out.println(normalValue);


    }
    String normalMethod(){
        return "normal methodum ben";
    }
    static String staticMethod(){
        return "static methodum ben";
    }
}
