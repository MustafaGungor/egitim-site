package com.mebitech.samples.quickstart.web.myapp.Interfaces;

/**
 * Created by Diagram on 05/06/2017.
 */
public class MainMain {
    public static void main(String[] args) {
//        CycleMain cycleMain = new CycleMain();
//        cycleMain.changeCadence(6);
//        cycleMain.changeGear(7);
        SekilMain sekilMain = new SekilMain();
        String sekilAdi =sekilMain.SekilAdi("kare");
        System.out.println(sekilAdi);
        sekilMain.Alan(5);
        sekilMain.Cevre(6);

        sekilAdi =sekilMain.SekilAdi("dikdörtgen");
        System.out.println(sekilAdi);
        sekilMain.Alan(10,6);
        sekilMain.Cevre(6,10);
    }
}
