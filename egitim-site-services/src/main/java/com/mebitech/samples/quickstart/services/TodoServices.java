package com.mebitech.samples.quickstart.services;

import com.mebitech.robe.persistence.jpa.services.JpaService;
import com.mebitech.samples.quickstart.domain.Todo;
import com.mebitech.samples.quickstart.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kamilbukum on 06/03/2017.
 */
@Service
public class TodoServices extends JpaService<Todo, String> {

    @Autowired
    public TodoServices(TodoRepository repository) {
        super(repository);
    }
}
