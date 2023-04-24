package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ALEX2 {
	@JsonIgnore
	private String name;
	private int id;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "ALEX2 [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	

}
