package com.example.JPAHibernate.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
@Autowired
    private ProductRepository repository;
public List<Product> finfALl(){
    return repository.findAll();
};
    @GetMapping
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
