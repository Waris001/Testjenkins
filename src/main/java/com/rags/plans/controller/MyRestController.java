package com.rags.plans.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.rags.plans.entity.Plans;
import com.rags.plans.service.PlanService;
import com.rags.props.AppMessages;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
public class MyRestController {

	private PlanService plnService ;
	private Map<String, String> msgProps;
	public MyRestController(PlanService plnService, AppMessages messages) {
		this.plnService=plnService;
		this.msgProps=messages.getMessages();
	}
	
	
//	@Autowired
//	private AppMessages messages ; 

	@GetMapping("/category")
	public ResponseEntity<Map<Integer, String>> getCategory() {
		Map<Integer, String> planCategory = plnService.getPlanCategory();
		return new ResponseEntity<>(planCategory, HttpStatus.OK);
	}
	
	@GetMapping("/ragmsg")
	public String getrags() {
		return "Happy coding";
	}
	
	@GetMapping("/plans")
	public ResponseEntity<List<Plans>> getMethodName(@RequestParam String param) {
		List<Plans> plans = plnService.getPlans();
		return new ResponseEntity<>(plans,HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<String> savePlan(@RequestBody Plans entity) {
		boolean savePlan = plnService.savePlan(entity);
		if(savePlan)
			return new ResponseEntity<>(msgProps.get("planSaveSucc"),HttpStatus.CREATED);
		return new ResponseEntity<>(msgProps.get("planSaveFail"),HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/delPlan/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		boolean deletePlan = plnService.deletePlan(id);
		if(deletePlan)
			return new ResponseEntity<>(msgProps.get("planDeleteSucc"),HttpStatus.OK);
		return new ResponseEntity<>(msgProps.get("planDeleteFail"),HttpStatus.FORBIDDEN);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<String> update(@RequestBody Plans plan) {
		boolean updatePlan = plnService.updatePlan(plan);
		if(updatePlan)
			return new ResponseEntity<>(msgProps.get("planUpdateSucc"),HttpStatus.OK);
		return new ResponseEntity<>(msgProps.get("planUpdateFail"),HttpStatus.FORBIDDEN);
	}

	@GetMapping("/getPlan/{id}")
	public ResponseEntity<Plans> getPlanByID(@PathVariable Integer id) {
		Plans plan = plnService.getPlan(id);
		return new ResponseEntity<>(plan,HttpStatus.OK);
	}

	@PutMapping("/status/{id}/{status}")
	public ResponseEntity<String> putMethodName(@PathVariable Integer id, @RequestBody String entity) {
		boolean activatePlan = plnService.activatePlan(id, entity);
		if(activatePlan)
			return new ResponseEntity<>(msgProps.get("planStatusChange"),HttpStatus.OK);
		return new ResponseEntity<>(msgProps.get("planStatusChangeFail"),HttpStatus.FORBIDDEN);
	}


}
