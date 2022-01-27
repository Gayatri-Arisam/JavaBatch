package com.example.demo.models;
import java.time.LocalDate;
public class Employee {
private int empno;
private String ename;
private LocalDate doj;
private int Basic;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public LocalDate getDoj() {
	return doj;
}
public void setDoj(LocalDate doj) {
	this.doj = doj;
}
public int getBasic() {
	return Basic;
}
public void setBasic(int basic) {
	Basic = basic;
}
/**
 * @param empno
 * @param ename
 * @param doj
 * @param basic
 */
public Employee(int empno, String ename, LocalDate doj, int basic) {
	this.empno = empno;
	this.ename = ename;
	this.doj = doj;
	Basic = basic;
}
	
	
}
