package com.example.demo.IService;

import java.util.List;

import com.example.demo.models.Emp;

public interface IEmpService {
	String insertEmp(Emp E);
	String updateEmp(Emp E,int empno);
	String deleteEmp(int empno);
	List<Emp> getEmpAll();
	Emp getEmpByEmpno(int empno);
}
