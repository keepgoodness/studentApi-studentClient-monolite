package com.yordan.studentapi.restapi.controllers;

import com.yordan.studentapi.restapi.models.Student;
import com.yordan.studentapi.restapi.repositories.StudentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jordan
 */
@RestController
@RequestMapping("api/students")
public class RestStudentController {

	private StudentRepository sr;

	@Autowired
	public RestStudentController(StudentRepository sr) {
		this.sr = sr;
	}

	@GetMapping("")
	public List<Student> getAll() {
		return this.sr.findAll();
	}

	@GetMapping("/{id}")
	public Student findById(@PathVariable String id) {
		Optional<Student> findById = sr.findById(Long.parseLong(id));
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
}
