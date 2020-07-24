package io.pragati.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository TopicRepository;
	public List<topic> getAllTopics() {
		//return topics;
		List<topic> topics=new ArrayList<>();
		TopicRepository.findAll().forEach(topics::add);
		return topics;
		}
	public topic gettopic(String id)
	{
		//return topics.parallelStream().filter(t->t.getId().equals(id)).findFirst().get();
	    return TopicRepository.findById(id).get();
	}
	public void addtopic(topic topic) {
		// TODO Auto-generated method stub
		//topics.add(topic);
		TopicRepository.save(topic);
		
	}
	public void updatetopic(String id,topic topic) {
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
		TopicRepository.save(topic);
	}
	public void deleteTopic(String id) {
		  TopicRepository.deleteById(id);
		 }
}
