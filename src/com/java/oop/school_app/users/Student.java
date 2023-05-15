package com.java.oop.school_app.users;

import java.sql.Date;
import java.util.UUID;

import com.java.oop.school_app.Adress;
import com.java.oop.school_app.Grades;
import com.java.oop.school_app.SchoolHistory;
import com.java.oop.school_app.Subjects;
import com.java.oop.users.enums.UniversityUnit;
import com.java.oop.users.enums.UserType;

// Encapsulation and Inheritance
public class Student extends User {

	public SchoolHistory schoolHistory;
	public Subjects subjects;
	public Grades grades;
	
	public Student(int id, String firstName, String lastName, UserType userType, Date memberSince, Adress adress,
			UniversityUnit universityUnit, SchoolHistory schoolHistory, Subjects subjects, Grades grades) {
		super(id, firstName, lastName, userType, memberSince, adress, universityUnit);
		this.schoolHistory = schoolHistory;
		this.subjects = subjects;
		this.grades = grades;
	}

	public SchoolHistory getSchoolHistory() {
		return schoolHistory;
	}

	public Subjects getSubjects() {
		return subjects;
	}

	public Grades getGrades() {
		return grades;
	}

	public void setSchoolHistory(SchoolHistory schoolHistory) {
		this.schoolHistory = schoolHistory;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	public void setGrades(Grades grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student [schoolHistory=" + schoolHistory + ", subjects=" + subjects + ", grades=" + grades + "]";
	}
}
