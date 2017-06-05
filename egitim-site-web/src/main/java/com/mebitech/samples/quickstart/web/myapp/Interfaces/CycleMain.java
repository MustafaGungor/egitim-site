package com.mebitech.samples.quickstart.web.myapp.Interfaces;

/**
 * Created by Diagram on 05/06/2017.
 */
public class CycleMain implements CycleInterface {
    @Override
    public void changeCadence(int newValue) {
        System.out.println(newValue);
    }

    @Override
    public void changeGear(int newValue) {
        System.out.println(newValue);
    }
}
