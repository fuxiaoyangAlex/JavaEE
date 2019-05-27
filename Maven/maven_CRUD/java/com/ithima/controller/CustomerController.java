package com.ithima.controller;

import com.ithima.po.Customer;
import com.ithima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String insertCustomer(Customer customer,Model model)throws Exception{
            customer.setUsername("alex");
            customer.setJobs("art");
            customer.setPhone("8615130");
            int i = customerService.insertCustomer(customer);
            model.addAttribute("add",i);
            return "cudCustomer";
    }

    @RequestMapping("/deleteCustomer")
    public String deleteCustomer(Integer id,Model model)throws Exception{
        int i = customerService.deleteCustomer(id);
        model.addAttribute("add",i);
        return "cudCustomer";
    }

    @RequestMapping("/updateCustomer")
    public String updateCustomer(Customer customer,Model model)throws Exception{
        customer.setUsername("change");
        customer.setJobs("physical");
        customer.setPhone("188519991");
        int i = customerService.updateCustomer(customer);
        model.addAttribute("add",i);
        return "cudCustomer";
    }

    @RequestMapping("/findCustomerById")
    public String findCustomerById(Integer id,Model model){
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customer",customer);
        return "customer";
    }

    @RequestMapping("/findAllCustomer")
    public String findAllCustomer(Model model){
        List<Customer> customerList =customerService.findAllCustomer();
        model.addAttribute("customerList",customerList);
        return "customerAll";
    }

}
