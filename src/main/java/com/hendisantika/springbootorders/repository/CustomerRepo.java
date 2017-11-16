package com.hendisantika.springbootorders.repository;

import com.hendisantika.springbootorders.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/11/17
 * Time: 07.12
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
