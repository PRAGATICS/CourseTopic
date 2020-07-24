package io.pragati.springbootquickstart.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<course,String>{
  public List<course> findBytopicId(String topicId);
  public List<course> findByDescription(String Description);
}
