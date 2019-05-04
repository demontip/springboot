package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
 
    
    @Column(length = 32)
    private String firstName;
    @Column(length = 32)
    private String lastName;

    public Customer1() {}

    public Customer1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer1[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

    
}
