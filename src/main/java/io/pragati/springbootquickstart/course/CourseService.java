package io.pragati.springbootquickstart.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository CourseRepository;
	public List<course> getAllCourses(String topicId) {
		//return topics;
		List<course> courses=new ArrayList<>();
		CourseRepository.findBytopicId(topicId).forEach(courses::add);
		return courses;
		}
	public course getCourse(String id)
	{
		//return topics.parallelStream().filter(t->t.getId().equals(id)).findFirst().get();
	    return CourseRepository.findById(id).get();
	}
	public void addCourse(course course) {
		// TODO Auto-generated method stub
		//topics.add(topic);
		CourseRepository.save(course);
		
	}
	public void updateCourse(String id,course course) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<=topics.size();i++)
		{
			topic t =topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
				
			}
		}*/
		CourseRepository.save(course);
	}
	public void deleteCourse(String id) {
		  CourseRepository.deleteById(id);
		 }
}
