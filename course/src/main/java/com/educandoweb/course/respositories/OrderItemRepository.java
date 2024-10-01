package com.educandoweb.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
