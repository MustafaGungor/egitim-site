package com.mebitech.samples.quickstart.web.myapp.Examples;
/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 04/06/2017.
 */
/**
 * Created by Diagram on 04/06/2017.
 * Aşağıdaki çıktıyı elde eden programı yaz
 * ////////////////////////////////////////
 *  ******
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 */
public class Question2 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++) {
            for (int j = 5; j >= i; j--)
                System.out.print("*");
            System.out.println("");
        }
    }
}
