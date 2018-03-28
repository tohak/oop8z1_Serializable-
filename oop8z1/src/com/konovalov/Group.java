package com.konovalov;

import java.io.Serializable;
import java.util.Arrays;

public class Group implements Serializable {

	private Student[] arrayGroup;
	private static final long serialVersionUID = 1L;

	public Group() {
		arrayGroup = new Student[0];
	}

	public Student[] getArrayGroup() {
		return arrayGroup;
	}

	public void setArrayGroup(Student[] arrayGroup) {
		this.arrayGroup = arrayGroup;
	}

	public void addStudent(Student student) {
		Student[] temp = new Student[arrayGroup.length + 1];
		System.arraycopy(arrayGroup, 0, temp, 0, arrayGroup.length);
		temp[temp.length - 1] = student;
		arrayGroup = temp;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arrayGroup.length; i++) {
			if (arrayGroup[i] != null) {
				sb.append(arrayGroup[i]);
				sb.append(System.lineSeparator());
			}
		}

		return sb.toString();
	}
}
