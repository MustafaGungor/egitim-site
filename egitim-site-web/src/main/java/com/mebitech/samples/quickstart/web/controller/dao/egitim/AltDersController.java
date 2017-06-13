package com.mebitech.samples.quickstart.web.controller.dao.egitim;

import com.mebitech.samples.quickstart.dao.egitim.AltDersDao;
import com.mebitech.samples.quickstart.domain.egitim.AltDers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see AltDers
 */
@RestController
@RequestMapping(value = "altders")
@Transactional
public class AltDersController {
    /**
     * Dao katmanında tanımlanan methodlara erişebilmek için kulllanılır.
     */
    @Autowired
    private AltDersDao altDersDao;

    /**
     * findAll methodu ile koşulsuz bir şekilde veritabaındaki tüm kayıtlar bize list şeklinde geri döner.
     * @return List
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<AltDers> findAll(){
        return altDersDao.findAll();
    }

    /**
     * AnaDers id si gönderilerek ona bağlı altdersleri List şeklinde geri dönen fonksiyon
     * @param oid
     * @return List
     */
    @RequestMapping(method = RequestMethod.GET,value = "{oid}")
    public List<AltDers> findAllOid(@PathVariable("oid") String oid){
        return altDersDao.getAllAsc(oid);
    }

    /**
     * create methodu ile gelen object kaydedilir.
     * @param todo
     * @return Object
     */
    @RequestMapping(method = RequestMethod.POST)
    public AltDers create(@RequestBody AltDers todo) {
        return altDersDao.create(todo);
    }

    /**
     * Put,update methodu ile gelen id ve objecye göre güncelleme işlemi yapılır
     * @param id
     * @param altDers
     * @return Object
     */
    @RequestMapping(method = RequestMethod.PUT,value = "{oid}")
    public AltDers update(@PathVariable("oid") String id,@RequestBody AltDers altDers){
        return altDersDao.update(altDers);
    }

    /**
     * Gelen id ye göre silme işlemi yapılır
     * @param id
     * @return Object
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public AltDers delete(@PathVariable("oid") String id) {
        return altDersDao.delete(id);
    }

}
