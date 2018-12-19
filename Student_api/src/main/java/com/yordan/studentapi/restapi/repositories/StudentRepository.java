package com.yordan.studentapi.restapi.repositories;

import com.yordan.studentapi.restapi.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jordan
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
