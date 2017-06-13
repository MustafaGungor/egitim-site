package com.mebitech.samples.quickstart.dao.egitim;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.egitim.AltDers;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see AltDers
 */
@Service
public class AltDersDao extends BaseDaoImpl<AltDers,String> {
    /**
     * AltDersleri ders id sine göre getiren method
     * @param oid
     * @return sonuc query list şeklinde controller sınıfına gönderilir.
     */
    public List<AltDers> getAllAsc(String oid) {
        return entityManager.createNamedQuery("altders.getAllAsc",AltDers.class).setParameter("paramName",oid).getResultList();
    }
}
