package com.hendisantika.springbootorders.repository;

import com.hendisantika.springbootorders.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/04/22
 * Time: 10.24
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
