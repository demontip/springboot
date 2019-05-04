package com.example.demo.web;

import com.example.demo.bean.Customer1;
import com.example.demo.service.Customer1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer1")
public class Customer1Controller {

    @Autowired
    private Customer1Service customer1Service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Customer1> getCustomers() {
        return customer1Service.getCustomers();
    }

    @RequestMapping(value = "/listPageable", method = RequestMethod.GET)
    public List<Customer1> getCustomersByPage() {
        int page = 0, size =3;
        Sort sort = new Sort(Sort.Direction.DESC, "lastName");
        Pageable pageable = PageRequest.of(page, size, sort);
        return customer1Service.getCustomersByPage(pageable);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Customer1 getCustomerById(@PathVariable("id") long id) {
        return customer1Service.getCustomerById(id);
    }
    
    @RequestMapping(value = "/lastName/{lastName}", method = RequestMethod.GET)
    public List<Customer1> getCustomerByLastName(@PathVariable("lastName")  String lastName) {
        return customer1Service.findByLastName(lastName);
    }

    @RequestMapping(value = "/id1toid2", method = RequestMethod.GET)
    public List<Customer1> getCustomerBtId(Long id1,Long id2){
    	return  customer1Service.findBtIdBetween(id1,id2);
    }

    
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String addCustomer(@RequestParam(value = "firstName", required = true) String firstName,
                              @RequestParam(value = "lastName", required = true) String lastName) {
        Customer1 customer1 = new Customer1();
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        Customer1 result = customer1Service.addCustomer(customer1);
        return result.toString();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateCustomer(@PathVariable("id") long id, @RequestParam(value = "firstName", required = true) String firstName,
                                 @RequestParam(value = "lastName", required = true) String lastName) {
        Customer1 customer1 = new Customer1();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        Customer1 result = customer1Service.updateCustomer(customer1);

        return result.toString();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteCustomerById(@PathVariable("id") long id) {
        customer1Service.deleteCustomerById(id);
        return "finish delete, Please check whether is success";
    }


}


