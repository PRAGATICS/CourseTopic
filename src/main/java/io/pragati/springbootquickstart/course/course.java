package io.pragati.springbootquickstart.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.pragati.springbootquickstart.topic.topic;

@Entity
public class course {
	private String CourseName;
	@Id
	private String id;
	private String description;
	@ManyToOne
	private topic topic;
	
	public course()
	{
		
	}
	public course(String courseName, String id, String description,String TopicId) {
		super();
		CourseName = courseName;
		this.id = id;
		this.description = description;
		this.settopic(new topic(TopicId,"",""));
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public topic gettopic() {
		return topic;
	}
	public void settopic(topic topic) {
		topic = topic;
	}
	

}
