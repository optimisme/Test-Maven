package com.project;

import java.io.Serializable;
import java.util.Set;

public class Employee implements Serializable {
    
      private long employeeId;
      private String firstName; 
      private String lastName;   
      
      private int salary;  
  
      private Set<Contact> contacts; // No té getter i setter perqué s'encarrega Contact.employees"

      public Employee() {}
    
      public Employee(String fname, String lname, int salary) {
         this.firstName = fname;
         this.lastName = lname;
         this.salary = salary;
      }

      public long getEmployeeId() {
         return employeeId;
      }
    
      public void setEmployeeId(long id) {
         this.employeeId = id;
      }
    
      public String getFirstName() {
         return firstName;
      }
    
      public void setFirstName(String first_name) {
         this.firstName = first_name;
      }
    
      public String getLastName() {
         return lastName;
      }
    
      public void setLastName(String last_name) {
         this.lastName = last_name;
      }
    
      public int getSalary() {
         return salary;
      }
    
      public void setSalary(int salary) {
         this.salary = salary;
      }

      public Set<Contact> getContacts () {
         return this.contacts;
      }

      public void setcontacts (Set<Contact> contacts) {
         this.contacts = contacts;
      }

      @Override
      public String toString () {
         return this.getEmployeeId() + ": " + this.getFirstName() + " " + this.getLastName() + ", " + this.getSalary();
      }
 }