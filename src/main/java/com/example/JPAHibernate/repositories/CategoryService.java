package com.example.JPAHibernate.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
@Autowired
    private CategoryRepository repository;
public List<Category> finfALl(){
    return repository.findAll();
};
    @GetMapping
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
