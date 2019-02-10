package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.FinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinderFacade {

    @Autowired
    private FinderService finderService;

    public void findEmployee(String lastname){
        finderService.findEmployee(lastname);
    }

    public void findCompanies(String name){
        finderService.findCompanies(name);
    }

}
