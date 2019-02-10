package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class FinderFacadeTest {

    @Autowired
    private FinderFacade finderFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindCompanies(){
        //Given
        Company company = new Company("Geek Computers");
        Company company1 = new Company("Black Swan Shipping ");
        Company company2 = new Company("Real Greek Taste");
        Company company3 = new Company("Al's Hardware");

        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Company> companies = companyDao.findByNameFragment("eek");
        //Then
        Assert.assertEquals(2,companies.size());

    }

    @Test
    public void testFindEmployees(){
        //Given
        Employee employee = new Employee("John", "Smith");
        Employee employee1 = new Employee("Stephanie", "Clarckson");
        Employee employee2 = new Employee("Linda", "Kovalsky");
        Employee employee3 = new Employee("Johny", "Arciszewski");

        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List<Employee> employees = employeeDao.findByLastNameFragment("arc");
        //Then
        Assert.assertEquals(2,employees.size());
    }
}
