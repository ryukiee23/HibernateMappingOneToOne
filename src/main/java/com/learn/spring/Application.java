package com.learn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.spring.entity.Address;
import com.learn.spring.entity.Student;
import com.learn.spring.repository.AddressRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	AddressRepository addressRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setName("Sharma");
		student.setAbout("CSE");
//		student.setStudentId(123);
		
		Address address = new Address();
		address.setCity("Delhi");
		address.setCountry("India");
		address.setStreet("Ajmeri Gate");
		
		student.setAddress(address);
		address.setStudent(student);
		
		
		addressRepository.save(address);
		
	}
}
