package com.konovalov;

import java.io.Serializable;

public class Student implements Serializable {
	private String surname;
	private String name;
	private String facultet;
	private int level;
	private static final long serialVersionUID = 1L;

	public Student(String surname, String name, String facultet, int level) {
		super();
		this.surname = surname;
		this.name = name;
		this.facultet = facultet;
		this.level = level;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFacultet() {
		return facultet;
	}

	public void setFacultet(String facultet) {
		this.facultet = facultet;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Student [" + (surname != null ? "surname=" + surname + ", " : "")
				+ (name != null ? "name=" + name + ", " : "") + (facultet != null ? "facultet=" + facultet + ", " : "")
				+ "level=" + level + "]";
	}

}
