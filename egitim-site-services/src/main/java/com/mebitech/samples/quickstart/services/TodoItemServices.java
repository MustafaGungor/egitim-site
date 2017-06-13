package com.mebitech.samples.quickstart.services;

import com.mebitech.robe.persistence.jpa.services.JpaService;
import com.mebitech.samples.quickstart.domain.TodoItem;
import com.mebitech.samples.quickstart.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 06/03/2017.
 */
@Service
public class TodoItemServices extends JpaService<TodoItem, String> {

    private TodoItemRepository repository;

    @Autowired
    public TodoItemServices(TodoItemRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<TodoItem> findByParentOid(String parentOid) {
        return repository.findByParent_oid(parentOid);
    }
}
