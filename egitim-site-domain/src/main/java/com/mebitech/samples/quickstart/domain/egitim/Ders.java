package com.mebitech.samples.quickstart.domain.egitim;

import com.mebitech.robe.persistence.jpa.domain.BaseEntity;

import javax.persistence.*;

/**
 * Created by Diagram on 30/04/2017.
 */
@Entity
@NamedQuery(name = "ders.getAllAsc",query = "select c from Ders c where c.altDers.oid=:paramName")
public class Ders extends BaseEntity {
    private String name;
    private String aciklama;
    @Column(columnDefinition="TEXT") //karakter tipini text olarak tanımlar diğerleri varchar(255)
    private String icerikAlani;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.REFRESH)
    private AltDers altDers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getIcerikAlani() {
        return icerikAlani;
    }

    public void setIcerikAlani(String icerikAlani) {
        this.icerikAlani = icerikAlani;
    }

    public AltDers getAltDers() {
        return altDers;
    }

    public void setAltDers(AltDers altDers) {
        this.altDers = altDers;
    }
}
