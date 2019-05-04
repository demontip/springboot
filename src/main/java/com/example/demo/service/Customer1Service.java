package com.example.demo.service;

import com.example.demo.bean.Customer1;
import com.example.demo.dao.Customer1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Customer1Service {

    @Autowired
    private Customer1Repository customer1Repository;

    public List<Customer1> getCustomers() {
        return (List<Customer1>) customer1Repository.findAll();
    }

    public List<Customer1> getCustomersByPage(Pageable pageable) {
        return (List<Customer1>) customer1Repository.findAll(pageable).getContent();
    }

    public Customer1 getCustomerById(long id) {
        return customer1Repository.findById(id).orElse(null);
    }
    
    public List<Customer1> findByLastName(String lastName) {
        return (List<Customer1>) customer1Repository.findByLastName(lastName);
    }
   
    public List<Customer1> findBtIdBetween(Long id1,Long id2){
    	return (List<Customer1>) customer1Repository.findBtIdBetween(id1,id2);
    }

    public Customer1 addCustomer(Customer1 customer1) {
        return customer1Repository.save(customer1);
    }

    public Customer1 updateCustomer(Customer1 customer1) {
        return customer1Repository.saveAndFlush(customer1);
    }

    public void deleteCustomerById(long id) {
        customer1Repository.deleteById(id);
    }


}
