package com.mebitech.samples.quickstart.dao.egitim;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.egitim.AnaDers;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Diagram on 29/04/2017.
 */
@Service
public class AnaDersDao extends BaseDaoImpl<AnaDers, String> {
    public List<AnaDers> getAllAsc(String id) {
        return entityManager.createNamedQuery("AnaDers.getAllAsc",AnaDers.class).getResultList();
    }
}
