package cn.neu.domain;

import java.io.Serializable;

public class Dept implements Serializable {
	
	private int id;
	private String dept_code;
	private String dept_name;
	private int dept_catagory;
	private int dept_type;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDept_code() {
		return dept_code;
	}
	
	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}
	
	public String getDept_name() {
		return dept_name;
	}
	
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	public int getDept_catagory() {
		return dept_catagory;
	}
	
	public void setDept_catagory(int dept_catagory) {
		this.dept_catagory = dept_catagory;
	}
	
	public int getDept_type() {
		return dept_type;
	}
	
	public void setDept_type(int dept_type) {
		this.dept_type = dept_type;
	}
	
	@Override
	public String toString() {
		return "Dept{" +
				"ID=" + id +
				", dept_code='" + dept_code + '\'' +
				", dept_name='" + dept_name + '\'' +
				", dept_catagory='" + dept_catagory + '\'' +
				", dept_type='" + dept_type + '\'' +
				'}';
	}
}
