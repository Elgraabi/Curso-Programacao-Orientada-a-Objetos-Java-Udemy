package com.educandoweb.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
