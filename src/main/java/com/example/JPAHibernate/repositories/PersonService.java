package com.example.JPAHibernate.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
@Autowired
    private UserRepository repository;
public List<Person> finfALl(){
    return repository.findAll();
};
    @GetMapping
    public Person findById(Long id){
        Optional<Person> obj = repository.findById(id);
        return obj.get();
    }

    public Person insert(Person obj){

        return repository.save(obj);
    }

    public void delete( Long id) {

        repository.deleteById(id);
    }



}
