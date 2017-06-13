package com.mebitech.samples.quickstart.web.controller.dao;

import com.mebitech.robe.persistence.api.criteria.Result;
import com.mebitech.robe.persistence.api.query.search.SearchModel;
import com.mebitech.samples.quickstart.dao.TodoDao;
import com.mebitech.samples.quickstart.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see Todo
 */
@RestController
@RequestMapping(value = "dao-todos")
@Transactional
public class DTodoController {

    @Autowired
    private TodoDao todoDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Todo> findAll(SearchModel model) {
        return todoDao.findAllStrict(model).getList();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Todo create(@RequestBody Todo todo) {
        return todoDao.create(todo);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public Todo delete(@PathVariable("oid") String id) {
        return todoDao.delete(id);
    }

    @RequestMapping(value = "select", method = RequestMethod.GET)
    public Result<Map<String, Object>> findAllSelect(SearchModel model) {
        String[] fields = {"oid","header"};
        model.setFields(fields);
        return todoDao.findAll(model);
    }

//    @RequestMapping(value = "properties", method = RequestMethod.GET)
//    public List properties() {
//        return todoDao.getProperties();
//    }
}
