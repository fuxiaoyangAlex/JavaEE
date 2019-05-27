package com.ithima.service;

import com.ithima.po.Customer;

import java.util.List;

public interface CustomerService {

    public int insertCustomer(Customer customer) throws Exception;

    public int deleteCustomer(int id) throws Exception;

    public int updateCustomer(Customer customer) throws Exception;

    public Customer findCustomerById(Integer id);

    public List<Customer> findAllCustomer();
}
