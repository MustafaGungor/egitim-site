package com.mebitech.samples.quickstart.web.myapp.General;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 04/06/2017.
 */
public class Integral {
    public double a,b,c,x,y,i;
    private double integral_hesap;
    Integral(){
        a=0;
        b=0;
        c=0;
        x=0;
        y=0;
        i=0;
        integral_hesap=0;
    }
    public Integral(int a,int b,int c,int x,int y,int i){
        this.a=a;
        this.b=b;
        this.c=c;
        this.x=x;
        this.y=y;
        this.i=i;
        this.integral_hesap = 0;
    }
    public double hesapla(){

        for (i=x+0.001;y>=i;i=i+0.001){
            integral_hesap += ((((Math.pow(x, 2.0)*a)+(x*b)+c)+((Math.pow(i, 2.0)*a)+(i*b)+c))/2)*(0.001);
            x = i;
        }
        return integral_hesap;
    }
}
