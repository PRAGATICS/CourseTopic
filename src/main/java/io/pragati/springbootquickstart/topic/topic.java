package io.pragati.springbootquickstart.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class topic {
	private String TopicName;
	@Id
	private String id;
	public topic()
	{
		
	}
	public topic(String topicName, String id, String description) {
		super();
		TopicName = topicName;
		this.id = id;
		this.description = description;
	}
	public String getTopicName() {
		return TopicName;
	}
	public void setTopicName(String topicName) {
		TopicName = topicName;
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
	private String description;
	

}
