package com.example.JPAHibernate.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
@Autowired
    private OrderRepository repository;
public List<Order> finfALl(){
    return repository.findAll();
};
    @GetMapping
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
