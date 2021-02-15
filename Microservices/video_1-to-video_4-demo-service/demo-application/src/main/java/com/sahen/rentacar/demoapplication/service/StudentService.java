package com.sahen.rentacar.demoapplication.service;

import com.sahen.rentacar.demoapplication.model.Student;

public interface StudentService {


    Student save(Student student);
    public Student fetchStudentById(int id);

}
