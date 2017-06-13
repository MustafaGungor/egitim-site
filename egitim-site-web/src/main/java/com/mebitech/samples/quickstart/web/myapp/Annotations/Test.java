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
@Target(ElementType.METHOD)
public @interface Test {
    public boolean enabled() default true;
}
