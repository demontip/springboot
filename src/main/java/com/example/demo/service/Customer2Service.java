package com.example.demo.service;

import com.example.demo.bean.Customer1;
import com.example.demo.bean.Customer2;
import com.example.demo.bean.Params;
import com.example.demo.dao.Customer1Repository;
import com.example.demo.dao.Customer2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class Customer2Service {

	@Autowired
    private Customer2Repository Customer2Repository;

    public List<Customer2> getCustomer2() {
        return (List<Customer2>) Customer2Repository.findAll();
    }

    public Customer2 getCustomer2ById(long id) {
        return Customer2Repository.findById(id).orElse(null);
    }   
    public Customer2 addCustomer2(Customer2 customer2) {
        return Customer2Repository.save(customer2);
    }
    
    public Customer2 updateCustomer2(Customer2 customer2) {
        return Customer2Repository.saveAndFlush(customer2);
    }

    public void deleteCustomer2ById(long id) {
    	Customer2Repository.deleteById(id);
    }
    
    public List<Params> getCustomerByCustomerId(){
        List<Params> params = new ArrayList<Params>();
        List<Object> result = Customer2Repository.getCustomerByCustomerId();
        for (Object o : result) {
            Object[] rowArray = (Object[]) o;
            Params param = new Params();
            param.setId((Long) rowArray[0]);
            param.setFirstName((String) rowArray[1]);
            param.setLastName((String) rowArray[2]);
            param.setAge((String) rowArray[3]);
            param.setSex((String) rowArray[4]);
            params.add(param);
        }

        return params;
    }
    
 

    
}
