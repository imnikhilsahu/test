package com.springrest.strest.service;

import java.util.List;

import com.springrest.strest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourse ();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	

}
