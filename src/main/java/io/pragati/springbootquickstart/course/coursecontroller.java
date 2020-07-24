package io.pragati.springbootquickstart.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.pragati.springbootquickstart.topic.topic;

@RestController
public class coursecontroller {

	@Autowired
	private CourseService CourseService;

	@RequestMapping("/topics/{id}/courses")
	// whatever u return using controller mapping gets automatically converted to
	// json
	public List<course> getallCourses(@PathVariable String id) {
		return CourseService.getAllCourses(id);

	}
	@RequestMapping("/topics/{topicid}/courses/{id}")
	public course getCourse(@PathVariable String id) {
		return CourseService.getCourse(id);
	}
	
	@PostMapping(value="/topics/{topicid}/courses")
	public void addCourse(@RequestBody course course,@PathVariable String topicid)
	{   course.settopic(new topic(topicid,"",""));
		CourseService.addCourse(course);
	}
	@PutMapping(value="/topics/{topicid}/courses/{id}")
	public void updateCourse(@RequestBody course course,@PathVariable String id,@PathVariable String topicid)
	{
	    course.settopic(new topic(topicid,"",""));
		CourseService.updateCourse(id,course);
	}
	//Similary we can use delete Mapping to delete.
	@DeleteMapping(value="/topics/{topicid}/courses/{id}")
	public void deleteCourse(@RequestBody course course,@PathVariable String id) {
		CourseService.deleteCourse(id);
		 }
	}
