package com.mebitech.samples.quickstart.web.myapp.Examples;

/**
 * Created by Diagram on 04/06/2017.
 *  ////////////////////////////////////////
 *  20 ile 90 arasındaki asal sayıları bulan program
 *  ////////////////////////////////////////
 */
public class Question1 {
    public static void main(String[] args) {
        int number1=20;
        int number2=90;
        for(int i=number1;i<number2;i++){
            int sayi = 0;
            for(int j=2;j<=i/2;j++)
                if(i%j==0) sayi++;
            if(sayi==0) System.out.println(+i + " ");

        }
    }
}
