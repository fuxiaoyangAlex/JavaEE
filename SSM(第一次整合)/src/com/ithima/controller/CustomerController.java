package com.ithima.controller;

import com.ithima.po.Customer;
import com.ithima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        @RequestMapping("/findCustomerById")
        public String findCustomerById(Integer id,Model model){
            Customer customer = customerService.findCustomerById(id);
            model.addAttribute("customer",customer);
            return "customer";
        }
}
