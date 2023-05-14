package com.java.oop.school_app.users;

import java.sql.Date;
import java.util.UUID;

import com.java.oop.school_app.Adress;
import com.java.oop.school_app.Resume;
import com.java.oop.school_app.Subjects;
import com.java.oop.users.enums.UniversityUnit;
import com.java.oop.users.enums.UserType;

public class Professor extends User {

	public Resume resume;
	public Subjects subjectsTaught;
	
	public Professor(UUID id, String firstName, String lastName, UserType userType, Date memberSince, Adress adress,
			UniversityUnit universityUnit, Resume resume, Subjects subjectsTaught) {
		this.resume = resume;
		this.subjectsTaught = subjectsTaught;
	}
	
	public Resume getResume() {
		return resume;
	}
	
	public Subjects getSubjectsTaught() {
		return subjectsTaught;
	}
	
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	
	public void setSubjectsTaught(Subjects subjectsTaught) {
		this.subjectsTaught = subjectsTaught;
	}

	@Override
	public String toString() {
		return "Professor [resume=" + resume + ", subjectsTaught=" + subjectsTaught + "]";
	}
 )
