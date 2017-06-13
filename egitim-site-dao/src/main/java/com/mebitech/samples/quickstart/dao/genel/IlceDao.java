package com.mebitech.samples.quickstart.dao.genel;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.genel.Ilce;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 29/04/2017.
 * @see Ilce
 */
 @Service
public class IlceDao extends BaseDaoImpl<Ilce,String>
{
    /**
     * İlceleri ile göre listeleyen method
     * @param id
     * @return List
     */
    public List<Ilce> getAllAsc(String id) {
        return entityManager.createNamedQuery("Ilce.getAllAsc",Ilce.class).setParameter("paramName",id).getResultList();
    }
}
