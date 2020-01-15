package com.arteck;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
 
@Entity
@Table(name = "Employee23")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
 

public class Employee {
 
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    @Column(name = "id")
    private int id;
   
    @Column(name = "name")
    private String name;
   
    @Column(name="city")
    private String city;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
   
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
}