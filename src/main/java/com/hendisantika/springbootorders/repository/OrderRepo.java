package com.hendisantika.springbootorders.repository;

import com.hendisantika.springbootorders.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/17
 * Time: 19.32
 * To change this template use File | Settings | File Templates.
 */
public interface OrderRepo extends JpaRepository<Orders, Long> {
}
