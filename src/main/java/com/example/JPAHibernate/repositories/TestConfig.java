package com.example.JPAHibernate.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person(null, "Maria Brown", "maria@gmail.com",
                "988888888", "123456");
        Person p2 = new Person(null, "Alex Green", "alex@gmail.com",
                "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), p1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), p2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), p1);

        userRepository.saveAll(Arrays.asList(p1, p2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
