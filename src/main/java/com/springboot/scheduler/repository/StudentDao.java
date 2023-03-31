package com.springboot.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.scheduler.model.Student;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
