package com.springdemo.springdemo.service;

import com.springdemo.springdemo.Entity.Employee1;
import com.springdemo.springdemo.Repository.EmployeeRepo;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeerepo;

    public Employee1 SaveDetails(Employee1 employee) {
        return employeerepo.save(employee);

    }

    public List<Employee1> savealldetails() {
        return employeerepo.findAll();
    }

    public Employee1 fetchDetailsbyid(int id) {
        return employeerepo.findById(id).orElse(null);
    }

    public Employee1 updateDetails(Employee1 employee) {
        Employee1 updateemployee = employeerepo.findById(employee.getId()).orElse(null);
        if (updateemployee != null) {

            updateemployee.setName(employee.getName());
            updateemployee.setRoll((employee.getRoll()));
            employeerepo.save(updateemployee);
            return updateemployee;
        }
        else {
            return null;
        }
    }

    public String deleteEmployee(int id) {
        if(employeerepo.existsById(id)){
            employeerepo.deleteById(id);
            return "deleted" + id;
        }
        else{
            return "wrong id entered";
        }


    }
}








