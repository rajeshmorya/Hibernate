package com.arteck;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="employee")
public class Employee
{
        protected Long employeeId;
         
        protected String name;
 
        @Id
        @Column(name="id")
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        public  Long getEmployeeId()
        {
                return employeeId;
        }
 
        public  void setEmployeeId(Long employeeId)
        {
                this.employeeId = employeeId;
        }
 
        @Column(name="ename")
        public  String getName()
        {
                return name;
        }
 
        public  void setName(String name)
        {
                this.name = name;
        }
 
        @Override
    public String toString()
    {
            return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
    }
         
         
}