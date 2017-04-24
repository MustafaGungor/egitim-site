package com.mebitech.samples.quickstart.dao;

import com.mebitech.robe.persistence.jpa.dao.BaseDaoImpl;
import com.mebitech.samples.quickstart.domain.TodoItem;
import org.springframework.stereotype.Service;


/**
 * Created by recepkoseoglu on 4/8/17.
 */
@Service
public class TodoItemDao extends BaseDaoImpl<TodoItem, String> {

}
