package com.springdemo.springdemo.Repository;



import com.springdemo.springdemo.Entity.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee1,Integer> {


}
