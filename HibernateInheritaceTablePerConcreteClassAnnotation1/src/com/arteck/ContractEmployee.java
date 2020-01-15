package com.arteck;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
 
@Entity
@Table(name = "ContractEmployee")
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class ContractEmployee extends Employee {
   
    @Column(name = "hourlyRate")
    private double hourlyRate;
 
    public double getHourlyRate() {
        return hourlyRate;
    }
 
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}