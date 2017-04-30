package com.mebitech.samples.quickstart.dao.genel;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.genel.Il;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Diagram on 29/04/2017.
 */
@Service
public class IlDao extends BaseDaoImpl<Il,String> {
    public List<Il> getAllAsc(String id) {
        return entityManager.createNamedQuery("Il.getAllAsc",Il.class).getResultList();
    }
}
