package com.mebitech.samples.quickstart.dao;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.Todo;
import org.springframework.stereotype.Service;


/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see Todo
 */
@Service
public class TodoDao extends BaseDaoImpl<Todo, String> {

}
