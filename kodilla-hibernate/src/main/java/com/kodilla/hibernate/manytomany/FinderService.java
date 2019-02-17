package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@Service
@EnableAspectJAutoProxy
public class FinderService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public void findEmployee(String name) {
        employeeDao.findAllEmployeesWithLastName(name).stream()
                .map(e -> e.getFirstName() + " " + e.getLastName()).forEach(System.out::println);
    }

    public void findCompanies(String name) {
        companyDao.findByNameFragment(name).stream()
                .map(c -> c.getName()).forEach(System.out::println);
    }
}
