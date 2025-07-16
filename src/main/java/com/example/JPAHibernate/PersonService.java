package com.example.JPAHibernate;

import com.example.JPAHibernate.repositories.Person;
import com.example.JPAHibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

}
