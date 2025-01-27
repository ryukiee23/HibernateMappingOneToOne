package com.learn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.spring.entity.Address;
import com.learn.spring.entity.Student;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
