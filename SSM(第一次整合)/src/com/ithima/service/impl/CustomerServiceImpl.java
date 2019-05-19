package com.ithima.service.impl;

import com.ithima.dao.CustomerDao;
import com.ithima.po.Customer;
import com.ithima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName CustomerServiceImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/5/19 19:35
 * @Version 1.8
 **/

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
  @Autowired
    private CustomerDao customerDao;
    //查询客户
    public Customer findCustomerById(Integer id) {
        return this.customerDao.findCustomerById(id);
    }
}
