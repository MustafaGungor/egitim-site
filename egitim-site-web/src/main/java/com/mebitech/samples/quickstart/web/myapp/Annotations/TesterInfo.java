package com.mebitech.samples.quickstart.web.myapp.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Diagram on 27/05/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TesterInfo {
    public enum Level {
        LOW,MEDIUM,HIGH
    }
    Level level() default Level.MEDIUM;

    String[] tags() default "";
    String createdLvl() default "MG";
    String lastUpdated() default "27/05/2016";
}
