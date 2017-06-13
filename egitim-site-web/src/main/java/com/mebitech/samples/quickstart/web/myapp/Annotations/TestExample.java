package com.mebitech.samples.quickstart.web.myapp.Annotations;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 27/05/2017
 */
@TesterInfo(
        level = TesterInfo.Level.HIGH,
        createdLvl = "MustafaGungor",
        tags = {"ilk","son olmaz","inşaAllah"}
)
public class TestExample {
    /**
     * testA runtimeException
     */
    @Test
    void testA(){
        if (true)
            throw new RuntimeException("This test always failed");
    }

    /**
     * tesb tu test class
     */
    @Test(enabled = false)
    void testB(){
        if (false)
            throw new RuntimeException("This test always passed");
    }

    /**
     * testC to test class
     */
    @Test(enabled = true)
    void testC(){
        if (10>1){
            //
        }

    }

}
