package com.mebitech.samples.quickstart.dao.egitim;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.egitim.Ders;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 29/04/2017.
 * @see Ders
 */
@Service
public class DersDao extends BaseDaoImpl<Ders,String> {
    /**
     * Dersleri altders id sine göre geri döndüren ve listeleyen method
     * @param oid
     * @return list şeklinde geri dönüş yapar (namedquery annotations)
     */
    public List<Ders> getAllAsc(String oid) {
        return entityManager.createNamedQuery("ders.getAllAsc",Ders.class).setParameter("paramName",oid).getResultList();
    }
}
