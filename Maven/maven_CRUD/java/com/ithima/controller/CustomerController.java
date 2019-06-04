package com.ithima.controller;

import com.ithima.po.Customer;
import com.ithima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName CustomerController
 * @Description TODO
 * @Author tree
 * @Date 2019/5/19 19:37
 * @Version 1.8
 **/

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/insertCustomer")
    @ResponseBody
    public String customerCreate(Customer customer)throws Exception{
        int i = customerService.insertCustomer(customer);
        if (i>0){
            return "OK";
        }else {
            return "FAIL";
        }
    }

    /**
     *
     * @param id
     * @param model
     * @return
     * @throws 删除客户
     */
    @RequestMapping("/delete.action")
    @ResponseBody
    public String deleteCustomer(Integer id)throws Exception{
        int rows = customerService.deleteCustomer(id);
        if(rows>0){
            return "OK";
        }else{
            return "FAIL";
        }
    }

    @RequestMapping("/updateCustomer")
    @ResponseBody
    public String updateCustomer(Customer customer)throws Exception{
        int i = customerService.updateCustomer(customer);
        if(i>0){
            return "OK";
        }else
            return "FAIL";
    }

    @RequestMapping("/findCustomerById")
    @ResponseBody
    public Customer findCustomerById(Integer id){
        Customer customer = customerService.findCustomerById(id);
        return  customer;
    }

    @RequestMapping("/findAllCustomer")
    public String findAllCustomer(Integer id,Model model){
        List<Customer> customerList =customerService.findAllCustomer();
        model.addAttribute("customerList",customerList);
        return "customerAll";
    }

}
