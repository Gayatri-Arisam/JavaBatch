package com.example.demo.models;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name="emp")
public class Emp {
	@Id
	 private int empno;
	 private String ename;
	 private String job;
	 private Integer mgr;
	 private LocalDate hiredate;
	 private int sal;
	 private Integer comm;
	 private int deptno;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
	if(mgr==null)
		return 0;
	else
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Integer getComm() {
	if(comm==null)
		return 0;
	else
		return comm;
	}
	public void setComm(Integer comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	/**
	 * @param empno
	 * @param ename
	 * @param job
	 * @param mgr
	 * @param hiredate
	 * @param sal
	 * @param comm
	 * @param deptno
	 */
	public Emp(int empno, String ename, String job, int mgr, LocalDate hiredate, int sal, int comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	/**
	 * 
	 */
	public Emp() {
		super();
	}	
	
	
}
