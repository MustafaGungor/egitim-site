package com.mebitech.samples.quickstart.domain.genel;

import com.mebitech.robe.persistence.jpa.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Diagram on 29/04/2017.
 */
@Entity
@Table(name = "il")
@NamedQuery(name = "Il.getAllAsc", query = "SELECT c FROM Il c order by c.ilKodu asc")
public class Il extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String ilAdi;
    private String ilKodu;

    public String getIlAdi() {
        return ilAdi;
    }

    public void setIlAdi(String ilAdi) {
        this.ilAdi = ilAdi;
    }

    public String getIlKodu() {
        return ilKodu;
    }

    public void setIlKodu(String ilKodu) {
        this.ilKodu = ilKodu;
    }
}