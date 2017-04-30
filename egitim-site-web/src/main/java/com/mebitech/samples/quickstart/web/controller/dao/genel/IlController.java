package com.mebitech.samples.quickstart.web.controller.dao.genel;

import com.mebitech.samples.quickstart.dao.genel.IlDao;
import com.mebitech.samples.quickstart.domain.genel.Il;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Diagram on 29/04/2017.
 */
@RestController
@RequestMapping(value = "iller")
@Transactional
public class IlController {
    @Autowired
    private IlDao ilDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Il> findAlll(){
        return ilDao.findAll();
    }
    @RequestMapping(method = RequestMethod.GET,value = "{oid}")
    public List<Il> findAll(@PathVariable("oid") String id){
        return ilDao.getAllAsc(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Il create(@RequestBody Il ilce) {
        return ilDao.create(ilce);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public Il delete(@PathVariable("oid") String id) {
        return ilDao.delete(id);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "{oid}" )
    public Il update(@RequestBody Il ilce, @PathVariable("oid") String id) {
        return ilDao.update(ilce);
    }
}
