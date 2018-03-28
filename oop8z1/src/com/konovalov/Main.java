package com.konovalov;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Student studentOne = new Student("st.One", "One", "IT", 1);
		Student studentTho = new Student("st.Tho", "Tho", "IT", 2);
		Student studentThree = new Student("st.Three", "Three", "IT", 3);
		Student studentFour = new Student("st.Four", "Four", "IT", 4);
		Student studentFive = new Student("st.Five", "Five", "IT", 5);

		Group groupStudent = new Group();
		try {
			groupStudent.addStudent(studentOne);
			groupStudent.addStudent(studentTho);
			groupStudent.addStudent(studentThree);
			groupStudent.addStudent(studentFour);
			groupStudent.addStudent(studentFive);
		} catch (Exception e) {
			System.out.println("Error, not addStudent");
		}
		System.out.println(groupStudent);
		System.out.println();

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("group"))) {
			oos.writeObject(groupStudent);
		} catch (IOException e) {
			System.out.println("Error, save group");
		}
		Group newGroupStudent = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("group"))) {
			newGroupStudent = (Group) ois.readObject();
		} catch (IOException | ClassNotFoundException | NullPointerException e) {
			System.out.println("Error load group from file");
		}
		System.out.println("new group: ");		

		System.out.println(newGroupStudent);

	}

}
