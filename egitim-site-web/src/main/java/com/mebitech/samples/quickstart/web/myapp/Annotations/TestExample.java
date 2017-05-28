package com.mebitech.samples.quickstart.web.myapp.Annotations;

/**
 * Created by Diagram on 27/05/2017.
 */
@TesterInfo(
        level = TesterInfo.Level.HIGH,
        createdLvl = "MustafaGungor",
        tags = {"ilk","son olmaz","inşaAllah"}
)
public class TestExample {
    @Test
    void testA(){
        if (true)
            throw new RuntimeException("This test always failed");
    }
    @Test(enabled = false)
    void testB(){
        if (false)
            throw new RuntimeException("This test always passed");
    }
    @Test(enabled = true)
    void testC(){
        if (10>1){
            //
        }

    }

}
