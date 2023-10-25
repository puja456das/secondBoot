package org.anudip.secondBoot.bean;

public class EmpBean {
	int id;
	String name;
	public EmpBean() {
		super();
	}
	public EmpBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
