package com.hendisantika.springbootorders.controller;

import com.hendisantika.springbootorders.model.Customer;
import com.hendisantika.springbootorders.repository.CustomerRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/04/22
 * Time: 10.07
 */
@RequiredArgsConstructor
@Controller
@RequestMapping("customers")
@Slf4j
public class CustomerWebController {
    private final CustomerRepo customerRepo;

    @GetMapping("/list")
    public String listCustomer(Model model) {
        Iterable<Customer> customers = customerRepo.findAll();
        model.addAttribute("customers", customers);
        log.info("List All customers");
        return "customer/customer_list";
    }

    @GetMapping("/create")
    public String showCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        log.info("Show add new customer form");
        return "customer/customer_add";
    }

    @PostMapping("/create")
    public String addCustomer(Model model, Customer customer) {
        model.addAttribute("customer", customerRepo.save(customer));
        log.info("Add new customer");
        return "redirect:/customers/list";
    }

    @GetMapping(value = "/edit/{id}")
    public String editFormCustomer(@PathVariable Long id, Model model) {
        model.addAttribute("customer", customerRepo.findById(id));
        log.info("Show customer details");
        return "customer/customer_add";
    }

    @GetMapping(value = "/hapus/{id}")
    public String hapusCustomer(@PathVariable Long id) {
        customerRepo.deleteById(id);
        log.info("Delete customer by ID");
        return "redirect:/customers/list";
    }
}
