package com.spring.restapi.restapi.service;

import com.spring.restapi.restapi.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String>{

}
