package com.mebitech.samples.quickstart.dao.egitim;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.egitim.Ders;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Diagram on 30/04/2017.
 */
@Service
public class DersDao extends BaseDaoImpl<Ders,String> {
    public List<Ders> getAllAsc(String oid) {
        return entityManager.createNamedQuery("ders.getAllAsc",Ders.class).setParameter("paramName",oid).getResultList();
    }
}
