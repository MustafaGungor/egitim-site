package com.mebitech.samples.quickstart.dao.egitim;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.egitim.AltDers;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Diagram on 30/04/2017.
 */
@Service
public class AltDersDao extends BaseDaoImpl<AltDers,String> {
    public List<AltDers> getAllAsc(String oid) {
        return entityManager.createNamedQuery("altders.getAllAsc",AltDers.class).setParameter("paramName",oid).getResultList();
    }
}
