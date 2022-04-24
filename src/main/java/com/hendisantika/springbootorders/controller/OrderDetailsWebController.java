package com.hendisantika.springbootorders.controller;

import com.hendisantika.springbootorders.model.OrderDetails;
import com.hendisantika.springbootorders.repository.OrderDetailsRepository;
import com.hendisantika.springbootorders.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/04/22
 * Time: 12.00
 */
@RequiredArgsConstructor
@Slf4j
@RequestMapping("order-details")
@Controller
public class OrderDetailsWebController {
    private final OrderDetailsRepository orderDetailsRepository;

    private final OrderService orderService;

    @GetMapping("/list")
    public String listOrders(Model model) {
        List<OrderDetails> orderDetails = orderDetailsRepository.findAll();
        model.addAttribute("orderDetails", orderDetails);
        return "order/order_details_list";
    }
}
