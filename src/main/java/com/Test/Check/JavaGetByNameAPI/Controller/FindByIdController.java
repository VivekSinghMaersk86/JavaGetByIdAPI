package com.Test.Check.JavaGetByNameAPI.Controller;

import com.Test.Check.JavaGetByNameAPI.Entity.Employee;
import com.Test.Check.JavaGetByNameAPI.Repository.EmployeeRepository;
import com.Test.Check.JavaGetByNameAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FindByIdController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/CheckName")
    public String testMethod() {
        return "NameListController";
    }

    @RequestMapping(value = "/Employee/{eid}", method = RequestMethod.GET)
    public Employee findByEmpName(@PathVariable("eid") int eid) throws Exception {
         Employee EmpObj = employeeRepository.findById(eid);
        return EmpObj;
    }


}
