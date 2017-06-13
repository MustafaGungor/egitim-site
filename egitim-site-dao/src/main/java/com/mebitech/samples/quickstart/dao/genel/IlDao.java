package com.mebitech.samples.quickstart.dao.genel;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.genel.Il;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 29/04/2017.
 * @see Il
 */
@Service
public class IlDao extends BaseDaoImpl<Il,String> {
    /**
     * İl classını geri döndüren method
     * @param id
     * @return List
     */
    public List<Il> getAllAsc(String id) {
        return entityManager.createNamedQuery("Il.getAllAsc",Il.class).getResultList();
    }
}
