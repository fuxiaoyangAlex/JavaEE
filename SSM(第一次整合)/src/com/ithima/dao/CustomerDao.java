package com.ithima.dao;

import com.ithima.po.Customer;

/**
 * @ClassName CustomerDao
 * @Description TODO
 * @Author tree
 * @Date 2019/5/19 19:29
 * @Version 1.8
 **/

public interface CustomerDao {
//    根据id查询客户信息
    public Customer findCustomerById(Integer id);
}
