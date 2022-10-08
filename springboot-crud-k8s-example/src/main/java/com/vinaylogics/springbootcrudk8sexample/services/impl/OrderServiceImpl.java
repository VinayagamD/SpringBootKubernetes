package com.vinaylogics.springbootcrudk8sexample.services.impl;

import com.vinaylogics.springbootcrudk8sexample.models.Order;
import com.vinaylogics.springbootcrudk8sexample.repositories.OrderRepository;
import com.vinaylogics.springbootcrudk8sexample.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;


    @Override
    public Order addOrder(Order order) {
        return repository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return repository.findAll();
    }

    @Override
    public Order getOrderById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id : "+id));
    }


}
