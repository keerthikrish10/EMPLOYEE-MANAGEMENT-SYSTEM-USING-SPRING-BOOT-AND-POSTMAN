package com.springdemo.springdemo.Controller;

import com.springdemo.springdemo.Entity.Employee1;
import com.springdemo.springdemo.service.EmployeeService;
import jdk.dynalink.beans.StaticClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee1 postDetails(@RequestBody Employee1 employee){
        return employeeService.SaveDetails(employee);
    }
    @GetMapping("/getEmployee")
    public List<Employee1>getDetails(){
        return employeeService.savealldetails();
    }

    @GetMapping("/getEmployeeid/{id}")
    public Employee1 fetchDetails(@PathVariable int id){
        return employeeService.fetchDetailsbyid(id);
    }

    @PutMapping("/updateEmployee")
    public Employee1 updateEmployeeDetails(@RequestBody Employee1 employee){

        return employeeService.updateDetails(employee);
    }

    @DeleteMapping("/deleteEmp/{id}")
    public String deletefunction(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

}
