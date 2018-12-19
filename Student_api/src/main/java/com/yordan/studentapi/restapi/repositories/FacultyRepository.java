package com.yordan.studentapi.restapi.repositories;

import com.yordan.studentapi.restapi.models.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jordan
 */
public interface FacultyRepository extends JpaRepository<Faculty, Long>{
	
}
