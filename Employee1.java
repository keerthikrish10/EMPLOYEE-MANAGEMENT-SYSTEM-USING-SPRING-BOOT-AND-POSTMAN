package com.springdemo.springdemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
@Data
@Table(name="EMPLOYEE_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Employee1 {

    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;

    @Column(name="ROLL")
    private String roll;

    @Column(name="NAME")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
