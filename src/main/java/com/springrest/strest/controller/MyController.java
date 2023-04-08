package com.springrest.strest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.strest.entities.Course;
import com.springrest.strest.service.CourseService;

@RestController


public class MyController {
	
	@Autowired
	private CourseService courseserv;
	
	
	@GetMapping("/home")
	public String home() {
		return "this is a home page";
		
	}
	
	// Get Courses
	
	@GetMapping("/courses")
	public List<Course> getCourses () {
		return this.courseserv.getCourse();
		
		
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCource(@PathVariable String courseId) {
		
		return this.courseserv.getCourse(Long.parseLong (courseId));
		
	}
	
	@PostMapping ("/course")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseserv.addCourse(course);
	}
	
	

}
