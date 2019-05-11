package com.niit.dao;

import com.niit.domain.Customer;
import org.junit.Test;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName TestCustomer
 * @Description TODO
 * @Author tree
 * @Date 2019/3/27 10:07
 * @Version 1.8
 **/
public class TestCustomer {
    CustomerDao customerDao = new CustomerDaoImpl();

    @Test
    public void insertCustomer() throws Exception {
        try {
            Customer customer = new Customer("Ar", "worker", "1354542");
            customerDao.insertCustomer(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("插入操作成功！");
    }

    @Test
    public void deleteCustomer() throws Exception {
        try {
            customerDao.deleteCustomer(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("删除操作执行成功！");
    }

    @Test
    public void updateCustomer() throws Exception {
        System.out.println("修改");
        Customer customer = customerDao.getCustomerById(5);
        System.out.println(customer);
        customer.setUsername("tom");
        customer.setJobs("teacher");
        customerDao.updateCustomer(customer);
        System.out.println(customerDao.getCustomerById(4));
    }

    //    根据ID查询
    @Test
    public void getCustomer() throws Exception {
        System.out.println("ID查询");
        Customer customer = customerDao.getCustomerById(5);
        System.out.println(customer);

    }

    @Test
    public void getAllCustomer() throws Exception {
        List<Customer> customerList = customerDao.getAllCustomer();
//            for(Customer customer:customerList){
//                   System.out.println(customer.getUsername()+customer.getJobs());
//            }
        customerList.forEach(customer -> System.out.println(customer));
    }

    @Test
    public void getCustomerByNameLike() throws Exception {
        List<Customer> customerByNameLike = customerDao.getCustomerByNameLike("付");
        for (Customer byName : customerByNameLike) {
            System.out.println(byName);
        }
    }

    @Test
    public void findCustomerByNameAndJobs() throws Exception {
        Customer customer = new Customer();
        customer.setUsername("Ar");
        customer.setJobs("teacher");
        List<Customer> customerList = customerDao.findCustomerByNameAndJobs(customer);
        customerList.forEach(customer1 -> System.out.println(customer1));
    }
    @Test
    public void findCustomerByNameOrJobs()throws Exception{
        Customer customer = new Customer();
        customer.setUsername("kk");
        customer.setJobs("scope");
        List<Customer> customerList = customerDao.findCustomerByNameOrJobs(customer);
        customerList.forEach(customer1 ->    System.out.println(customer1));
    }
}

