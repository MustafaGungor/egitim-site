package com.mebitech.samples.quickstart.web.controller.dao.genel;

import com.mebitech.samples.quickstart.dao.genel.IlceDao;
import com.mebitech.samples.quickstart.domain.genel.Ilce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Diagram on 29/04/2017.
 */
@RestController
@RequestMapping(value = "ilceler")
@Transactional
public class IlceController {
    @Autowired
    private IlceDao ilceDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ilce> findAlll(){
        return ilceDao.findAll();
    }
    @RequestMapping(method = RequestMethod.GET,value = "{oid}")
    public List<Ilce> findAll(@PathVariable("oid") String id){
        return ilceDao.getAllAsc(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Ilce create(@RequestBody Ilce ilce) {
        return ilceDao.create(ilce);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public Ilce delete(@PathVariable("oid") String id) {
        return ilceDao.delete(id);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "{oid}" )
    public Ilce update(@RequestBody Ilce ilce, @PathVariable("oid") String id) {
        return ilceDao.update(ilce);
    }
}
