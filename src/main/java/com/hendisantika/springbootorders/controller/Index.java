package com.hendisantika.springbootorders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/11/17
 * Time: 07.13
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/")
public class Index {

    @GetMapping()
    Map index(){
        Map map = new HashMap();
        map.put("title", "Home Page Orders Management System.");
        map.put("waktu", new Date());
        return  map;
    }
}
