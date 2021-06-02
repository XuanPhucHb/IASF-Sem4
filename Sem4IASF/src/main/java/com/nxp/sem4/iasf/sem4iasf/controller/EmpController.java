package com.nxp.sem4.iasf.sem4iasf.controller;

import com.nxp.sem4.iasf.sem4iasf.entity.Employees;
import com.nxp.sem4.iasf.sem4iasf.repo.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/nxp/v1/emp")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmpController {

    @Autowired
    EmpRepository empRepository;

    @RequestMapping(value = "/findAllEmployees")
    List<Employees> findAllEmployees() {
        List<Employees> result = empRepository.findAll();
        return result;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Employees create(@RequestBody Employees employees) {
        Employees studentResult = empRepository.save(employees);
        return studentResult;
    }



}
