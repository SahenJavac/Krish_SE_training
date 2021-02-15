package com.sahen.rentacar.demoapplication.repository;

import com.sahen.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
