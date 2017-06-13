package com.mebitech.samples.quickstart.web.myapp.Examples;
/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 04/06/2017.
 */
/**
 * Created by Diagram on 04/06/2017.
 * Aşağıdaki şekli oluşturan programı yazınız
 * //////////////////////////////////////////
 *     aaaaaaaaaaaaaaaa
 *     a              a
 *     a              a
 *     aaaaaaaaaaaaaaaa
 */
public class Question3 {
    public static void main(String[] args) {
        int i = 4;
        for(int j = 0; j<i ; j++)
            if(j==0 || j==3)
                System.out.println("aaaaaaaaaa");
            else
                System.out.println("a        a");
    }
}
