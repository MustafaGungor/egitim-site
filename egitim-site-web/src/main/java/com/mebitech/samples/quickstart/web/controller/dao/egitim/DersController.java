package com.mebitech.samples.quickstart.web.controller.dao.egitim;

import com.mebitech.samples.quickstart.dao.egitim.DersDao;
import com.mebitech.samples.quickstart.domain.egitim.Ders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 30/04/2017
 * @see Ders
 */
@RestController
@RequestMapping(value = "dersler")
@Transactional
public class DersController {
    /**
     * dersDao autowired yapılarak fonksiyonlarına erişim sağlanır
     */
    @Autowired
    private DersDao dersDao;

    /**
     * sabit get fonksiyonu ile hiç bir koşul olmadan datalar restful servislerine return edilir
     * @return List<Ders>
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Ders> findAll(){
        return dersDao.findAll();
    }

    /**
     * Bu get methoduna gönderilen id altders id si ile koşullu get sorgusu yapılır
     * @param oid
     * @return List<Ders>
     */
    @RequestMapping(method = RequestMethod.GET,value = "{oid}")
    public List<Ders> findAllOid(@PathVariable("oid") String oid){
        return dersDao.getAllAsc(oid);
    }

    /**
     * Post ile create işlemi yapılır RequestBody ile object alınır
     * @param ders
     * @return Object
     */
    @RequestMapping(method = RequestMethod.POST)
    public Ders create(@RequestBody Ders ders) {
        return dersDao.create(ders);
    }

    /**
     * Put ile update yapılır ve bize gelen ders idsine göre seçilim yapılır.
     * @param id
     * @param ders
     * @return Object
     */
    @RequestMapping(method = RequestMethod.PUT,value = "{oid}")
    public Ders update(@PathVariable("oid") String id,@RequestBody Ders ders){
        return dersDao.update(ders);
    }

    /**
     * Delete methodu seçili objenin id sini alarak veritabanından silme işlemini yapar.
     * @param id
     * @return Object
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public Ders delete(@PathVariable("oid") String id) {
        return dersDao.delete(id);
    }
}
