package com.educandoweb.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
