package com.mebitech.samples.quickstart.web.controller.dao.egitim;

import com.mebitech.samples.quickstart.dao.egitim.AnaDersDao;
import com.mebitech.samples.quickstart.domain.egitim.AnaDers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Diagram on 29/04/2017.
 */
@RestController
@RequestMapping(value = "anaders")
@Transactional
public class AnaDersController {
    @Autowired
    private AnaDersDao anaDersDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<AnaDers> getListAll(){
        return anaDersDao.findAll();
    }
    @RequestMapping(method = RequestMethod.POST)
    public AnaDers create(@RequestBody AnaDers todo) {
        return anaDersDao.create(todo);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "{oid}")
    public AnaDers update(@PathVariable("oid") String id,@RequestBody AnaDers anaDers){
        return anaDersDao.update(anaDers);
    }
    @RequestMapping(method = RequestMethod.GET,value = "{oid}")
    public List<AnaDers> findAll(@PathVariable("oid") String id){
        return anaDersDao.getAllAsc(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public AnaDers delete(@PathVariable("oid") String id) {
        return anaDersDao.delete(id);
    }


}
