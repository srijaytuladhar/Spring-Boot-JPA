package com.spring.restapi.restapi.service;

import com.spring.restapi.restapi.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service        // business logic
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getStudents() {
        // creating new student list
        List<Student> students = new ArrayList<>();
        // iterating all the students on the database
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public Optional<Student> getStudentsById(String id) {
        return studentRepository.findById(id);
    }


    public String createStudent(Student student) {
        studentRepository.save(student);
        System.out.println("Student created successfully!!");
        return "Student created successfully!!";
    }

    public String updateStudent(String id, Student student) {
        studentRepository.save(student);
        System.out.println("Student with id: " +id+ " updated successfully!!");
        return "Student with id: " +id+ " updated successfully!!";
    }

    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        System.out.println("Student with id: " +id+ " deleted successfully!!");
        return "Student with id: " +id+ " deleted successfully!!";

    }
}
