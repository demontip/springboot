package com.example.demo.web;

import com.example.demo.bean.Customer1;
import com.example.demo.bean.Customer2;
import com.example.demo.bean.Params;
import com.example.demo.service.Customer1Service;
import com.example.demo.service.Customer2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer2")
public class Customer2Controller {
	  @Autowired
	    private Customer2Service Customer2Service;

	    @RequestMapping(value = "/list", method = RequestMethod.GET)
	    public List<Customer2> getCustomer2() {
	        return Customer2Service.getCustomer2();
	    }
	    
	    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	    public Customer2 getCustomer2ById(@PathVariable("id") long id) {
	        return Customer2Service.getCustomer2ById(id);
	    }
	    
	    @RequestMapping(value = "", method = RequestMethod.POST)
	    public String addCustomer2(@RequestParam(value = "age", required = true) String age,
	                              @RequestParam(value = "sex", required = true) String sex) {
	    	Customer2 customer2 = new Customer2();
	    	customer2.setAge(age);
	    	customer2.setSex(sex);
	    	Customer2 result = Customer2Service.addCustomer2(customer2);
	        return result.toString();
	    }
	    
	    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	    public String updateCustomer2(@PathVariable("id") long id, @RequestParam(value = "age", required = true) String age,
	                                 @RequestParam(value = "sex", required = true) String sex) {
	    	Customer2 customer2 = new Customer2();
	    	customer2.setId(id);
	    	customer2.setAge(age);
	    	customer2.setSex(sex);
	    	Customer2 result = Customer2Service.updateCustomer2(customer2);

	        return result.toString();
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	    public String deleteCustomer2ById(@PathVariable("id") long id) {
	    	Customer2Service.deleteCustomer2ById(id);
	        return "finish delete, Please check whether is success";
	    }
	    
	    @RequestMapping(value = "/equalcustomerid", method = RequestMethod.GET)
	    public List<Params> getCustomerByCustomerId() {
	        return Customer2Service.getCustomerByCustomerId();
	    }
	    
	    
}

