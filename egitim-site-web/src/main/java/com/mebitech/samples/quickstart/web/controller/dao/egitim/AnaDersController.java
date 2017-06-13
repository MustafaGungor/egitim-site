package com.mebitech.samples.quickstart.web.controller.dao.egitim;

import com.mebitech.samples.quickstart.dao.egitim.AnaDersDao;
import com.mebitech.samples.quickstart.domain.egitim.AnaDers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see AnaDers
 */
@RestController
@RequestMapping(value = "anaders")
@Transactional
public class AnaDersController {
    /**
     * Dao katmonunun tüm methodlarına erişebilmek için autowired yapılır
     */
    @Autowired
    private AnaDersDao anaDersDao;

    /**
     * List şeklinde tüm datayı bize döner.
     * @return List
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<AnaDers> getListAll(){
        return anaDersDao.findAll();
    }

    /**
     * POST ile seçilen kayıt veritabanına kayıt edilir.(create methodu)
     * @param anaDers
     * @return Object
     */
    @RequestMapping(method = RequestMethod.POST)
    public AnaDers create(@RequestBody AnaDers anaDers) {
        return anaDersDao.create(anaDers);
    }

    /**
     * AnaDers id si alınarak PUT üzerinden update gerçekleştirilir.
     * @param id
     * @param anaDers
     * @return Object
     */
    @RequestMapping(method = RequestMethod.PUT,value = "{oid}")
    public AnaDers update(@PathVariable("oid") String id,@RequestBody AnaDers anaDers){
        return anaDersDao.update(anaDers);
    }

    /**
     * getAllAsc ile belirlenen id ye göre listeleme yapılır.
     * @param id
     * @return List
     */
    @RequestMapping(method = RequestMethod.GET,value = "{oid}")
    public List<AnaDers> findAll(@PathVariable("oid") String id){
        return anaDersDao.getAllAsc(id);
    }

    /**
     * DELETE methodu ile verilen id ye göre silme işlemi yapılır.
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public AnaDers delete(@PathVariable("oid") String id) {
        return anaDersDao.delete(id);
    }


}
