package com.mebitech.samples.quickstart.web.controller.dao.egitim;

import com.mebitech.samples.quickstart.dao.egitim.AltDersDao;
import com.mebitech.samples.quickstart.domain.egitim.AltDers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Diagram on 30/04/2017.
 */
@RestController
@RequestMapping(value = "altders")
@Transactional
public class AltDersController {
    @Autowired
    private AltDersDao altDersDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<AltDers> findAll(){
        return altDersDao.findAll();
    }
    @RequestMapping(method = RequestMethod.GET,value = "{oid}")
    public List<AltDers> findAllOid(@PathVariable("oid") String oid){
        return altDersDao.getAllAsc(oid);
    }
    @RequestMapping(method = RequestMethod.POST)
    public AltDers create(@RequestBody AltDers todo) {
        return altDersDao.create(todo);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "{oid}")
    public AltDers update(@PathVariable("oid") String id,@RequestBody AltDers altDers){
        return altDersDao.update(altDers);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public AltDers delete(@PathVariable("oid") String id) {
        return altDersDao.delete(id);
    }

}
