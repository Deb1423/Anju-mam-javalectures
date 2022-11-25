package com.student.studentmanagement;

import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentDetailsDao;
import com.entity.Student;
import com.entity.StudentDetails;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		StudentDetailsDao studentDetailsDao = new StudentDetailsDao();

		// test Save Student
		Student student = new Student("Debjit", "Talukder", "debjit@gmail.com");
		StudentDetails studentDetails = new StudentDetails("Kolkata", 11);
		studentDao.saveStudent(student);
		studentDetailsDao.saveStudentDetails(studentDetails);

		Student student1 = new Student("Ankit", "Chakraborty", "Ankit@gmail.com");
		StudentDetails studentDetails1 = new StudentDetails("Kolkata", 12);
		studentDao.saveStudent(student);
		studentDetailsDao.saveStudentDetails(studentDetails);
		// update student
		student.setFirstName("Deb");
		studentDao.updateStudent(student);
		// get Student By Id
		Student student3 = studentDao.getByStudent(student.getId());
		// get all student
		List<Student> s = studentDao.getAllStudent();
		s.forEach(student2 -> System.out.println(student2.getId()));
		// Delete student.
		studentDao.deleteStudent(student.getId());

	}
}
