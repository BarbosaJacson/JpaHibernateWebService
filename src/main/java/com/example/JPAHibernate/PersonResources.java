package com.example.JPAHibernate;

import com.example.JPAHibernate.repositories.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class PersonResources {
    @Autowired
    private PersonService service;
    @GetMapping
    public ResponseEntity<List<Person>>findAll(){

    List<Person> list = service.finfALl();
    return ResponseEntity.ok().body(list);

}
    @GetMapping(value = "/{id}")
    public ResponseEntity<Person> findById(@PathVariable Long id){
        Person obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
