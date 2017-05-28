package com.mebitech.samples.quickstart.web.myapp.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Diagram on 27/05/2017.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Islem {
     int Topla();
     int Cikar();
     int Carp();
     int Bol();
}
