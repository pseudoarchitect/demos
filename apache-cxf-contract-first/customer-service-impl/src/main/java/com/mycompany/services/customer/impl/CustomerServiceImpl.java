/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services.customer.impl;

import com.example.customerservice.Customer;
import com.example.customerservice.CustomerService;
import com.example.customerservice.NoSuchCustomerException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pseudoarchitect
 */
public class CustomerServiceImpl implements CustomerService {

  public void updateCustomer(Customer customer) {
    System.out.println("Customer updated successfully...");
  }

  public List<Customer> getCustomersByName(String name) throws NoSuchCustomerException {
    List<Customer> customers = new ArrayList<Customer>();
    Customer customer1 = new Customer();
    customer1.setName("Pseudo Architect");
    customers.add(customer1);

    return customers;
  }
}
