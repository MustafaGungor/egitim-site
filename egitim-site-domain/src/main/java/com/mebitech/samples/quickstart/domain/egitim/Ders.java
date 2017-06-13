package com.mebitech.samples.quickstart.domain.egitim;

import com.mebitech.robe.persistence.jpa.domain.BaseEntity;

import javax.persistence.*;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see Ders
 */
@Entity
@NamedQuery(name = "ders.getAllAsc",query = "select c from Ders c where c.altDers.oid=:paramName")
public class Ders extends BaseEntity {
    //Ders adı
    private String name;
    //Ders için ön açıklama
    private String aciklama;
    //Ders icerik alanı
    @Column(columnDefinition="TEXT") //karakter tipini text olarak tanımlar diğerleri varchar(255)
    private String icerikAlani;
    //Alt Ders objesi
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
