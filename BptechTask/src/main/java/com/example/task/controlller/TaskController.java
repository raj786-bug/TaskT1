package com.example.task.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.task.entity.TaskEntity;
import com.example.task.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	TaskService taskService;
	@GetMapping("/l1")  
	private List<TaskEntity> getAllBooks()   
	{  
	return taskService.getAllLattice();  
	}  
	// Add a user
	@PostMapping("/l1")
	private long savelattice(@RequestBody TaskEntity l1) {
		taskService.save(l1);
		return l1.getId();
	}
	// delete a user
	@DeleteMapping("/l1/{l1id}")
	private void deleteLattice(@PathVariable("l1id") int l1id) {
		taskService.delete(l1id);
	}
	// update a user
	@PutMapping("/l1")
	private TaskEntity update(@RequestBody TaskEntity l1) {
		taskService.save(l1);
		return l1;
	}
	

}
