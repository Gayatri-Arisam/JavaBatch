package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.IService.IEmpService;
import com.example.demo.ServiceImpl.EmpServiceImpl;
import com.example.demo.models.Emp;
import com.example.demo.models.Employee;

@RestController
public class EmpController {
	@Autowired
	 IEmpService  empServiceImpl;
	@GetMapping("/emplist")
	public List<Emp> Result() {
		return empServiceImpl.getEmpAll();
	}

}
