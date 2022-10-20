package com.smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smart.entity.Student;
import com.smart.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Abhishek","Panda","abhishekpanda0310@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student("DibyaBina","Hota","Dibyabinahota@gmail.com");
		studentRepository.save(student2);
		Student student3 = new Student("Test","email","testemail@gmail.com");
		studentRepository.save(student3);
	}

}
