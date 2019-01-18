package sample.city;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author syedrahmath
 * 
 */
@RestController
@Transactional
public class CityController {

    private final CityDao dao;

    @Autowired
    public CityController(CityDao dao) {
        this.dao = dao;
    }
    /**
     * 
     * @return
     */
    @RequestMapping("/")
    public List<City> selectAll() {
    	System.out.println("###################");
        return dao.selectAll();
    }
    /**
     * 
     * @param id
     * @param name
     * @return
     */
    @RequestMapping("/update")
    public List<City> updateAndSelectAll(
            @RequestParam(value = "id", defaultValue = "1") int id,
            @RequestParam("name") String name) {
        City city = dao.selectById(id);
        city.name = name;
        dao.update(city);
        return dao.selectAll();
    }

}
