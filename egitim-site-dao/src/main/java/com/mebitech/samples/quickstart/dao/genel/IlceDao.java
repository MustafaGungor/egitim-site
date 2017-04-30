package com.mebitech.samples.quickstart.dao.genel;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.genel.Ilce;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Diagram on 29/04/2017.
 */
 @Service
public class IlceDao extends BaseDaoImpl<Ilce,String>
{
    public List<Ilce> getAllAsc(String id) {
        return entityManager.createNamedQuery("Ilce.getAllAsc",Ilce.class).setParameter("paramName",id).getResultList();
    }
}
