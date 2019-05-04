package com.example.demo.dao;

import com.example.demo.bean.Customer1;
import com.example.demo.bean.Customer2;
import com.example.demo.bean.Params;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface Customer2Repository extends JpaRepository<Customer2, Long> {

    @Query(value="select c.id as id,c.firstName as firstName,c.lastName as lastName,s.age as age,s.sex as sex from Customer2 s,Customer1 c where c.id=s.id")
	List<Object> getCustomerByCustomerId(); 
	

	
    

}
