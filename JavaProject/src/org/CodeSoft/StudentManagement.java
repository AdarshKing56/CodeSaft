package org.CodeSoft;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StudentManagementMethode smm = new StudentManagementMethode();

		while (true) {
			System.out.println("1. Add a Student");
			System.out.println("2. Remove a Student");
			System.out.println("3. Search for a Student");
			System.out.println("4. Display All Students");
			System.out.println("5. Exit");

			int n = sc.nextInt();
			sc.nextLine();

			switch (n) {
			case 1:
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Roll Number: ");
				int rollNumber = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Grade: ");
				String grade = sc.nextLine();
				Student sd = new Student(name, rollNumber, grade);
				smm.addStudent(sd);
				System.out.println("Added succefully");
				break;

			case 2:
				System.out.print("Enter Roll Number to Remove: ");
				int rl = sc.nextInt();
				Student sr = smm.searchStudent(rl);
				if (sr != null) {
					smm.removeStudent(sr);
					System.out.println("Student removed.");
				} else {
					System.out.println("Student not found.");
				}
				break;

			case 3:
				System.out.print("Enter Roll Number to Search: ");
				int srn = sc.nextInt();
				Student fs = smm.searchStudent(srn);

				if (fs != null) {
					System.out.println("Student found:");
					System.out.println(fs);
				} else {
					System.out.println("Student not found.");
				}
				break;

			case 4:
				System.out.println("All Students:");
				smm.displayAll();
				break;

			case 5:
				System.out.println("Exiting Student Management System.");
				sc.close();
				System.exit(0);

			default:
				System.err.println("Invalid option. Please select 1-5.");
			}
		}

	}

}

class Student {
	private String name;
	private int rollNumber;
	private String grade;

	Student(String name, int rollNumber, String grade) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", grade=" + grade + "]";
	}

}

class StudentManagementMethode {
	private ArrayList<Student> al = new ArrayList<>();

	public void addStudent(Student st) {
		al.add(st);
	}

	public void removeStudent(Student st) {
		al.remove(st);
	}

	public Student searchStudent(int rollNumber) {
		for (Student st : al) {
			if (st.getRollNumber() == rollNumber)
				return st;
		}
		return null;
	}

	public void displayAll() {
		for (Student st : al) {
			System.out.println(st);
		}
	}

}
