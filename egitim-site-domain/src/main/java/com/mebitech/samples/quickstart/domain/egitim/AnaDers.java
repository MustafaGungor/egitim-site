package com.mebitech.samples.quickstart.domain.egitim;

import com.mebitech.robe.persistence.jpa.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Diagram on 29/04/2017.
 */
@Entity
@NamedQuery(name = "AnaDers.getAllAsc", query = "SELECT c FROM AnaDers c order by c.dersKodu asc")
public class AnaDers extends BaseEntity implements Serializable{
    private String name;
    private String dersKodu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDersKodu() {
        return dersKodu;
    }

    public void setDersKodu(String dersKodu) {
        this.dersKodu = dersKodu;
    }
}
