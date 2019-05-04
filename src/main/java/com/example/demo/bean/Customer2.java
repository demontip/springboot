package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer2 {


    @Id
    private Long id;
    

    
    @Column(length = 32)
    private String age;
    @Column(length = 32)
    private String sex;

    public Customer2() {}

    public Customer2(String age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer2[people_id=%d, age='%s', sex='%s']",
                id, age,sex
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    

    
	
}

