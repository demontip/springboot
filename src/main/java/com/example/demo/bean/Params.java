package com.example.demo.bean;


import javax.persistence.*;


public class Params {
	 
	 public Long id;
	 public String firstName;
	 public String lastName;
	 public String age;
	 public String sex;
	 
	 public Params(Long id, String firstName, String lastName,String age,String sex) {
		    this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.sex = sex;
	    }
	 
	 public Params() {}
	 
	    public void setId(Long id) {
	        this.id = id;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    
	    public void setAge(String age) {
	        this.age = age;
	    }
	    
	    public void setSex(String sex) {
	        this.sex = sex;
	    }

}
