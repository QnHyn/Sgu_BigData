package com.hynqn.bean;

public class Employee {
	private Integer id;
	private String lastName;
	private Department dept;
	
	public Employee(Integer id, String lastName, Department dept) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", dept=" + dept + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	// 获取出轨对象名称
	public String getOutName() {
		return "抽小怪";
	}
}
