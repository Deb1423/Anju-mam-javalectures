package com.student.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.student.entity.Student;
import com.student.model.StudentDTO;

@Component
public class Converter {
	
	//convert StudentDTO to Entity(student) 
	public Student convertToEntity(StudentDTO studentDTO)
	{
		Student student= new Student();
		if(studentDTO!=null)
		{
			BeanUtils.copyProperties(studentDTO, student);
		}
		return student;
	}
	//convert Entity(student)  to StudentDTO
	public StudentDTO convertToStudentDTO(Student student)
	{
		StudentDTO studentDTO = new StudentDTO();
		if(student!=null)
		{
			BeanUtils.copyProperties(student, studentDTO);
		}
		return studentDTO;
	}
}
