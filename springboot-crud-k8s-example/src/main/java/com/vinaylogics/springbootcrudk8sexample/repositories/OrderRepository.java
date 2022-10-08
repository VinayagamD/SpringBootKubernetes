package com.vinaylogics.springbootcrudk8sexample.repositories;

import com.vinaylogics.springbootcrudk8sexample.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}