package com.example.JPAHibernate.repositories;

import com.example.JPAHibernate.repositories.OrderItem; // Importe a sua entidade OrderItem
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {

}