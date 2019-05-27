package com.ithima.service.impl;

import com.ithima.dao.CustomerDao;
import com.ithima.po.Customer;
import com.ithima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName CustomerServiceImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/5/26 0:15
 * @Version 1.8
 **/
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public int insertCustomer(Customer customer)throws Exception{
        return customerDao.insertCustomer(customer);
    }

    @Override
    public int deleteCustomer(int id) throws Exception {
        return customerDao.deleteCustomer(id);
    }

    @Override
    public int updateCustomer(Customer customer) throws Exception {
        return customerDao.updateCustomer(customer);
    }


    public Customer findCustomerById(Integer id) {
        return customerDao.findCustomerById(id);
    }

    public List<Customer> findAllCustomer(){
        return customerDao.findAllCustomer();
    }
}
