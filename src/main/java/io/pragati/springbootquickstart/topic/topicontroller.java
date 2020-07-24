package io.pragati.springbootquickstart.topic;

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

@RestController
public class topicontroller {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	// whatever u return using controller mapping gets automatically converted to
	// json
	public List<topic> getallTopics() {
		return topicService.getAllTopics();

	}
	@RequestMapping("/topics/{id}")
	public topic gettopic(@PathVariable String id) {
		return topicService.gettopic(id);
	}
	
	@PostMapping(value="/topics")
	public void addtopic(@RequestBody topic topic)
	{
		topicService.addtopic(topic);
	}
	@PutMapping(value="/topics/{id}")
	public void updatetopic(@RequestBody topic topic,@PathVariable String id)
	{
		topicService.updatetopic(id,topic);
	}
	//Similary we can use delete Mapping to delete.
	@DeleteMapping(value="/topics/{id}")
	public void deleteTopic(@RequestBody topic topic,@PathVariable String id) {
		topicService.deleteTopic(id);
		 }
	}
