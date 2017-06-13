package com.mebitech.samples.quickstart.web.controller.repository;

import com.mebitech.samples.quickstart.domain.TodoItem;
import com.mebitech.samples.quickstart.services.TodoItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 13/04/2017
 * @see TodoItem
 */
@RestController
@RequestMapping(value = "repository-todo-items")
public class RTodoItemController {
    @Autowired
    private TodoItemServices todoItemServices;

    @RequestMapping(method = RequestMethod.POST)
    public TodoItem create(@RequestBody TodoItem todoItem) {
        return todoItemServices.create(todoItem);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public TodoItem delete(@PathVariable("oid") String id) {
        return todoItemServices.delete(id);
    }
}
