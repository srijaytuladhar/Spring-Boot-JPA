package com.spring.restapi.restapi.controller;

import com.spring.restapi.restapi.Student;
import com.spring.restapi.restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    // GET
    @RequestMapping("/students")
    public List<Student> getStudent() {
        return studentService.getStudents();
    }

    // GET students by id
    @RequestMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable String id) {
        return studentService.getStudentsById(id);
    }

    // POST
    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public ResponseEntity<Object> addStudent(@RequestBody Student student) {
        return new ResponseEntity<>( studentService.createStudent(student), HttpStatus.ACCEPTED);
    }

    // PUT
    @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateStudent(@RequestBody Student student, @PathVariable String id) {
        return new ResponseEntity<>(studentService.updateStudent(id, student), HttpStatus.ACCEPTED);
    }

    // DELETE
    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteStudent(@PathVariable String id) {
        return new ResponseEntity<>(studentService.deleteStudent(id), HttpStatus.ACCEPTED);
    }
}
