package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class Controller {

	@Autowired
	StudentService studentService;
	
	 @GetMapping("/health")
	 public String health() {
	     return "Ok";
	 }
	 
	 @GetMapping("/listOfEmployee")
	 public List<Student> list() {
	     return studentService.getAllStudents();
	 }
	 
	 @PostMapping("/saveEmployee")
	 public void saveEmployee(@RequestBody Student student) {
	      studentService.addUser(student);
	 }
}
