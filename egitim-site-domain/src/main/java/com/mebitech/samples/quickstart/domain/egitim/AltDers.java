package com.mebitech.samples.quickstart.domain.egitim;

import com.mebitech.robe.persistence.jpa.domain.BaseEntity;

import javax.persistence.*;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see AltDers
 */
@Entity
@NamedQuery(name = "altders.getAllAsc",query = "select c from AltDers c where c.anaDers.oid=:paramName")
public class AltDers extends BaseEntity {
    //AltDers Adı
    private String name;
    //AnaDers referans objesi
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.REFRESH)
    private AnaDers anaDers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnaDers getAnaDers() {
        return anaDers;
    }

    public void setAnaDers(AnaDers anaDers) {
        this.anaDers = anaDers;
    }
}
