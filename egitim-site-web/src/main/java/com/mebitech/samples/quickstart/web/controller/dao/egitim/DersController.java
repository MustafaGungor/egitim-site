package com.mebitech.samples.quickstart.web.controller.dao.egitim;

import com.mebitech.samples.quickstart.dao.egitim.DersDao;
import com.mebitech.samples.quickstart.domain.egitim.Ders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Diagram on 30/04/2017.
 */
@RestController
@RequestMapping(value = "dersler")
@Transactional
public class DersController {
    @Autowired
    private DersDao dersDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ders> findAll(){
        return dersDao.findAll();
    }
    @RequestMapping(method = RequestMethod.GET,value = "{oid}")
    public List<Ders> findAllOid(@PathVariable("oid") String oid){
        return dersDao.getAllAsc(oid);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Ders create(@RequestBody Ders todo) {
        return dersDao.create(todo);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "{oid}")
    public Ders update(@PathVariable("oid") String id,@RequestBody Ders altDers){
        return dersDao.update(altDers);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public Ders delete(@PathVariable("oid") String id) {
        return dersDao.delete(id);
    }
}
