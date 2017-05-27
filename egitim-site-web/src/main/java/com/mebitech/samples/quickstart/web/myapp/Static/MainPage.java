package com.mebitech.samples.quickstart.web.myapp.Static;

/**
 * Created by Diagram on 27/05/2017.
 */
public class MainPage {
    public static void main(String[] args) {
        //Static method ve değişkenlere nesne oluşturmadan direkt ulaşılır.
        System.out.println(staticMethod());
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
