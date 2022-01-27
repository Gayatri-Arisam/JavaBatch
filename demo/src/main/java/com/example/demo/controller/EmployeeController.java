package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;

@RestController
public class EmployeeController {

	static List<Employee> list = new ArrayList<Employee>();

	public EmployeeController() {
		list.add(new Employee(1, "BB", LocalDate.of(2006, 11, 01), 10000));
		list.add(new Employee(2, "BB", LocalDate.of(2002, 10, 01), 10000));
		list.add(new Employee(3, "CC", LocalDate.of(2003, 11, 01), 20000));
		list.add(new Employee(4, "BB", LocalDate.of(2001, 12, 01), 10000));
	}

	@GetMapping("/emps")
	public List<Employee> Result() {
		return list;
	}

	@GetMapping("/emps/{empno}")
	public Optional<Employee> Result(@PathVariable int empno) {
		Optional<Employee> E = list.stream().filter(e -> e.getEmpno() == empno).findFirst();
		if (E.isPresent())
			return E;
		else
			return null;

	}

	@PostMapping("/emps")
	public String Result(@RequestBody Employee E) {
		list.add(E);
		return "1 row inerted";
	}

	@PutMapping("/emps/{empno}")
	public String Result(@RequestBody Employee newEmp, @PathVariable int empno) {
		Optional<Employee> old = list.stream().filter(e -> e.getEmpno() == empno).findFirst();
		old.get().setEname(newEmp.getEname());
		 
		old.get().setDoj(newEmp.getDoj()); 
		old.get().setBasic(newEmp.getBasic());
		 return "1 Row updated";

	}
	@DeleteMapping("/emps/{empno}")
	public String Result1(@PathVariable int empno) {
		Optional<Employee> old = list.stream().filter(e -> e.getEmpno() == empno).findFirst();
		list.remove(old.get());
		return "1 Row updated";

	}

}
