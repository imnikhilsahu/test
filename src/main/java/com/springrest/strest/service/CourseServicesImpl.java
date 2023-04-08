package com.springrest.strest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.strest.entities.Course;

@Service
public class CourseServicesImpl implements CourseService {

	
	List<Course> list;
	
	public CourseServicesImpl () {
		
		list = new ArrayList<>();
		list.add(new Course(123,"Java book", "Core Java Basics"));
		 list.add(new Course(123, "Advance Java", "Java Frameworks Basics"));
		 
	}
		
	
	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		
		for (Course course:list)
		{
			if(course.getId() == courseId) {
				
				c = course;
				break;
				
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
	
		return course;
	}
	
	
	



}
