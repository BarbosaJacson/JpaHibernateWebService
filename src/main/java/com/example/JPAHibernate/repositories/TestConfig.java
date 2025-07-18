package com.example.JPAHibernate.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person(null, "Maria Brown", "maria@gmail.com",
                "988888888", "123456");
        Person p2 = new Person(null, "Alex Green", "alex@gmail.com",
                "977777777", "123456");

        userRepository.saveAll(Arrays.asList(p1, p2));

    }
}
