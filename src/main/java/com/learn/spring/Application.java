package com.learn.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.spring.entity.Address;
import com.learn.spring.entity.Student;
import com.learn.spring.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setName("Arpit");
		student.setAbout("Mechanical Engineer!");
		
		
		Address address1 = new Address();
		address1.setCity("Delhi");
		address1.setCountry("India");
		address1.setStreet("Ajmeri Gate");
		address1.setStudent(student);
		
		Address address2 = new Address();
		address2.setCity("MP");
		address2.setCountry("India");
		address2.setStreet("Bapat");
		address2.setStudent(student);
		
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);
		
		student.setAddresslist(addresses);
			
		studentRepository.save(student);
		
	}
}
