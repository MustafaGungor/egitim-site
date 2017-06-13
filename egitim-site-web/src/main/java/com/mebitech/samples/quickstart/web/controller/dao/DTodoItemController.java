package com.mebitech.samples.quickstart.web.controller.dao;

import com.mebitech.samples.quickstart.dao.TodoItemDao;
import com.mebitech.samples.quickstart.domain.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see TodoItem
 */
@RestController
@RequestMapping(value = "dao-todo-items")
@Transactional
public class DTodoItemController {
    @Autowired
    private TodoItemDao todoItemDao;

    @RequestMapping(method = RequestMethod.POST)
    public TodoItem create(@RequestBody TodoItem todoItem) {
        return todoItemDao.create(todoItem);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public TodoItem delete(@PathVariable("oid") String id) {
        return todoItemDao.delete(id);
    }
}
