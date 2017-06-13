package com.mebitech.samples.quickstart.web.myapp.Encapsulation;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 27/05/2017
 */
public class LongClass {
    public static void main(String[] args) {
        LongTwo longTwo = new LongTwo();
        String b = longTwo.string(7);
        System.out.println(b);
    }
}

//Birden fazla class kullacaksak aynı sayfada yalnızca bir tane zorunlu public,private,protected falan olur
/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 */
class LongTwo{
    public String string(int a){
        return "Sen bu dünyada ancak bu kadar "+ a +"kez mutlu olabilirsin.";
    }
}
/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 */
class LongThree {
}
