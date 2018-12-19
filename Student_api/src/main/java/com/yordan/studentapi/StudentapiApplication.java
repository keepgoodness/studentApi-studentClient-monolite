package com.yordan.studentapi;

import com.yordan.studentapi.restapi.models.Faculty;
import com.yordan.studentapi.restapi.models.Student;
import com.yordan.studentapi.restapi.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentapiApplication implements CommandLineRunner {
	
	private final StudentRepository studentRepository;

	@Autowired
	public StudentapiApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		studentRepository.deleteAll();
		
		Student s1 = new Student("yordan", "dimitrov", "taushanov", "1122334455", new Faculty("FACULTY OF HISTORY"));
		Student s2 = new Student("ivan", "ivanov", "lazarov", "2211332244", new Faculty("FACULTY OF PHILOSOPHY"));
		Student s3 = new Student("marin", "kamenarov", "sotirov", "1234567890", new Faculty("FACULTY OF LAW"));
		Student s4 = new Student("petyr", "blagoev", "petrov", "1213141516", new Faculty("FACULTY OF MATHEMATICS AND INFORMATICS"));
		Student s5 = new Student("dimityr", "dimitrov", "dimitrov", "3422334455", new Faculty("FACULTY OF THEOLOGY"));

		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		studentRepository.save(s4);
		studentRepository.save(s5);

	}

}

