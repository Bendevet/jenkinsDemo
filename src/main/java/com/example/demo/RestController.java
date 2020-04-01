package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;






@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	BuildingLocationRepo buildingRepo;
	
	@GetMapping("please")
	public String please() {
		return "please work";
	}
	
	@GetMapping("buildings")
	public QuickyListResponse<BuildingLocation> getBuildings(){
		return new QuickyListResponse(buildingRepo.findAll());
	}

	@PostMapping("building")
	public String saveBuilding(@RequestBody BuildingLocation buildingLocation) {
		buildingRepo.save(buildingLocation);
		return "success";
	}

	@Autowired
	KafkaTemplate<String,User> kafkaTemplate;

	@PostMapping("send")
	public String message(){
        kafkaTemplate.send("mtopic",new User("Bendevet",29));
		return "message sent";
	}

}
