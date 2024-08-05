package com.educandoweb.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
