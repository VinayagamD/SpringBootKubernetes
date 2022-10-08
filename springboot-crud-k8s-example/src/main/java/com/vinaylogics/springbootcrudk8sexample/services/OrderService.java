package com.vinaylogics.springbootcrudk8sexample.services;

import com.vinaylogics.springbootcrudk8sexample.models.Order;

import java.util.List;

public interface OrderService {

    Order addOrder(Order order);

    List<Order> getOrders();

    Order getOrderById(int id);
}
