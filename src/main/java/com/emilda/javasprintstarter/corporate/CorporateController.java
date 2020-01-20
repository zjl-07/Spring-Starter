package com.emilda.javasprintstarter.corporate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CorporateController {
    @Autowired
    private CorporateService corporateService;

    @RequestMapping("/corporates")
    public List<Corporate> getAllCorporates(){
        final List<Corporate> allCorporates = corporateService.getAllCorporates();
        return allCorporates;
    }

    @RequestMapping("corporates/{id}")
    public Corporate getCorporate(@PathVariable Integer id){
        return corporateService.getCorporate(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/corporates")
    public void addCorporate(@RequestBody Corporate corporate){
        corporateService.addCorporate(corporate);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/corporates/{id}")
    public void updateCorporate(@RequestBody Corporate corporate, @PathVariable Integer id){
        corporateService.updateCorporate(corporate,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/corporates/{id}")
    public void deleteCorpoorate(@PathVariable Integer id){
        corporateService.deleteCorporate(id);
    };
}
