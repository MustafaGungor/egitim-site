package com.mebitech.samples.quickstart.web.myapp.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Islem {
     /**
      * Toplama İşlemi
      * @return void
      */
     int Topla();

     /**
      * Çıkarma İşlemi
      * @return void
      */
     int Cikar();

     /**
      * Çarpma İşlemi
      * @return void
      */
     int Carp();

     /**
      * Bölme işlemi
      * @return void
      */
     int Bol();
}
