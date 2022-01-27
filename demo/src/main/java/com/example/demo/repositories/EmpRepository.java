package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Emp;
@Repository
public interface EmpRepository extends CrudRepository<Emp, Integer> {

}
