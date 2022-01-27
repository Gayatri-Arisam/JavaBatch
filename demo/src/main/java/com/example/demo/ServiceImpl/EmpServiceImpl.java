package com.example.demo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.IService.IEmpService;
import com.example.demo.models.Emp;
import com.example.demo.repositories.EmpRepository;
@Service
public class EmpServiceImpl implements IEmpService 
{
@Autowired
EmpRepository empRepository;
	
	@Override
	public String insertEmp(Emp E) {
		// TODO Auto-generated method stub
		empRepository.save(E);
		return "1 Row inserted";
	}

	@Override
	public String updateEmp(Emp E, int empno) {
		// TODO Auto-generated method stub
		return "1 update";
	}

	@Override
	public String deleteEmp(int empno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> getEmpAll() {
		// TODO Auto-generated method stub
		List<Emp>list=new ArrayList<Emp>();
		empRepository.findAll().forEach(i->list.add(i));
		return list;	
	}

	@Override
	public Emp getEmpByEmpno(int empno) {
		// TODO Auto-generated method stub
		return null;
	}

}
