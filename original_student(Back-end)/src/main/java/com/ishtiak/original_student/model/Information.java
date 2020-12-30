package com.ishtiak.original_student.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "information")
public class Information {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	
	@Column(name = "Stu_Name")
	private String s_name;
	
	@Column(name = "Dept")
	private String s_dept;
	
	@Column(name = "Age")
	private int s_age;
	
	@Column(name = "U_id")
	private int s_id;
	
	@Column(name = "Stu_Email")
	private String s_email;
	
	@Column(name = "Phone")
	private int s_phone;
	
	
	
	
	
	public Information() {
		super();
	}

	public Information(int id, String s_name, String s_dept, int s_age, int s_id, String s_email,
			int s_phone) {
		super();
		this.id = id;
		this.s_name = s_name;
		this.s_dept = s_dept;
		this.s_age = s_age;
		this.s_id = s_id;
		this.s_email = s_email;
		this.s_phone = s_phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_dept() {
		return s_dept;
	}

	public void setS_dept(String s_dept) {
		this.s_dept = s_dept;
	}

	public Integer getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_email() {
		return s_email;
	}

	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	public Integer getS_phone() {
		return s_phone;
	}

	public void setS_phone(int s_phone) {
		this.s_phone = s_phone;
	}

	
}

