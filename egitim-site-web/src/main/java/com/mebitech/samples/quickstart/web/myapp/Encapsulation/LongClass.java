package com.mebitech.samples.quickstart.web.myapp.Encapsulation;

/**
 * Created by Diagram on 27/05/2017.
 */
public class LongClass {
    public static void main(String[] args) {
        LongTwo longTwo = new LongTwo();
        String b = longTwo.string(7);
        System.out.println(b);
    }
}

//Birden fazla class kullacaksak aynı sayfada yalnızca bir tane zorunlu public,private,protected falan olur
class LongTwo{
    public String string(int a){
        return "Sen bu dünyada ancak bu kadar "+ a +"kez mutlu olabilirsin.";
    }
}

class LongThree {
}
