package com.ithima.dao;

import com.ithima.po.Customer;

import java.util.List;

/**
 * @ClassName CustomerDao
 * @Description TODO
 * @Author tree
 * @Date 2019/5/26 0:08
 * @Version 1.8
 **/
public interface CustomerDao {

    public int insertCustomer(Customer customer) throws Exception;

    public int deleteCustomer(int id) throws Exception;

    public int updateCustomer(Customer customer) throws Exception;

    public Customer findCustomerById(Integer id);

    public List<Customer> findAllCustomer();
}
