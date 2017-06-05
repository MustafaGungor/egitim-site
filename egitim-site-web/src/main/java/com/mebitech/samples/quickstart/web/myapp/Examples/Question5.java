package com.mebitech.samples.quickstart.web.myapp.Examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Diagram on 04/06/2017.
 *  3x3 lük 2 matris tanımlayın ve içerisine bir şeyler yazın
 * */
public class Question5 {
    public static void main(String[] args) {
        int matrisBir[][] = new int[3][3];
        int[][] matrisIki = new int[3][3];
        DegerAl(matrisBir);
        DegerAl(matrisIki);

        for (int i = 0; i < matrisBir.length; i++) {
            for (int k = 0; k < matrisBir[i].length; k++) {
                System.out.println((i + 1) + ".satir " + (k + 1) + ".sutun toplami: " + Integer.valueOf(matrisBir[i][k] + matrisIki[i][k]));

            }
        }

    }
    public static void DegerAl(int Dizi[][]) {

        try {
            BufferedReader oku = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < Dizi.length; i++) {
                for (int k = 0; k < Dizi[i].length; k++) {
                    System.out.print("1.Matris icin :" + (i + 1) + ".satir " + (k + 1) + ".sutun  ");
                    Dizi[i][k] = Integer.valueOf(oku.readLine());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
