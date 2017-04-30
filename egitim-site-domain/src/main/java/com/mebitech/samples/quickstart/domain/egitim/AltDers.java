package com.mebitech.samples.quickstart.domain.egitim;

import com.mebitech.robe.persistence.jpa.domain.BaseEntity;

import javax.persistence.*;

/**
 * Created by Diagram on 30/04/2017.
 */
@Entity
@NamedQuery(name = "altders.getAllAsc",query = "select c from AltDers c where c.anaDers.oid=:paramName")
public class AltDers extends BaseEntity {
    private String name;
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
