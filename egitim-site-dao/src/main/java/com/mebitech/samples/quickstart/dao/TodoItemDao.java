package com.mebitech.samples.quickstart.dao;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.TodoItem;
import org.springframework.stereotype.Service;


/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see TodoItem
 */
@Service
public class TodoItemDao extends BaseDaoImpl<TodoItem, String> {

}
