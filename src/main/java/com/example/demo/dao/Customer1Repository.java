package com.example.demo.dao;
import com.example.demo.bean.Customer1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface Customer1Repository extends JpaRepository<Customer1, Long> {

    List<Customer1> findByLastName(String lastName);
    
    @Query("select s from Customer1 s where s.id between ?1 and ?2")
  	List<Customer1> findBtIdBetween(Long id1, Long id2);
    
    @Transactional(timeout = 10)
    @Modifying
    @Query("delete from Customer1 where id = ?1")
    void deleteCustomer1WithSqlByUserId(Long id);
    

	
}