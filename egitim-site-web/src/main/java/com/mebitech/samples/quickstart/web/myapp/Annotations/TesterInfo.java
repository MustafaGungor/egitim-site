package com.mebitech.samples.quickstart.web.myapp.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 27/05/2017
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TesterInfo {
    /**
     * enum type level
     */
    public enum Level {
        LOW,MEDIUM,HIGH
    }

    /**
     * Default level
     * @return Level()
     */
    Level level() default Level.MEDIUM;

    /**
     * default string null
     * @return String
     */
    String[] tags() default "";

    /**
     * create level MG
     * @return String
     */
    String createdLvl() default "MG";

    /**
     * updatelasttime
     * @return String
     */
    String lastUpdated() default "27/05/2016";
}
