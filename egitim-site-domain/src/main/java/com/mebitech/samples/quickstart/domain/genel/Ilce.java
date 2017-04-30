package com.mebitech.samples.quickstart.domain.genel;

import com.mebitech.robe.persistence.jpa.domain.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Diagram on 29/04/2017.
 */
@Entity
@Table(name = "ilce")
@NamedQuery(name = "Ilce.getAllAsc", query = "SELECT p FROM Ilce p where p.il.oid=:paramName")
public class Ilce extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "ilce_adi")
    private String ilceAdi;

    @Column(name = "ilce_kodu")
    private String ilceKodu;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "il_oid", referencedColumnName = "oid")
    private Il il;

    public String getIlceAdi() {
        return ilceAdi;
    }

    public void setIlceAdi(String ilceAdi) {
        this.ilceAdi = ilceAdi;
    }

    public String getIlceKodu() {
        return ilceKodu;
    }

    public void setIlceKodu(String ilceKodu) {
        this.ilceKodu = ilceKodu;
    }

    public Il getIl() {
        return il;
    }

    public void setIl(Il il) {
        this.il = il;
    }
}