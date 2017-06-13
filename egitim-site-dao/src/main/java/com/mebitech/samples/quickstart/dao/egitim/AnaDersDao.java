package com.mebitech.samples.quickstart.dao.egitim;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.egitim.AnaDers;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 29/04/2017.
 * @see AnaDers
 */
@Service
public class AnaDersDao extends BaseDaoImpl<AnaDers, String> {
    /**
     * AnaDers leri id sine göre özel olarak listeleyen method
     * @param id
     * @return List<AnaDers>
     */
    public List<AnaDers> getAllAsc(String id) {
        return entityManager.createNamedQuery("AnaDers.getAllAsc",AnaDers.class).getResultList();
    }
}
