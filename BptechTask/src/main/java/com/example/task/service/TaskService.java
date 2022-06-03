package com.example.task.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.entity.TaskEntity;
import com.example.task.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	TaskRepository task;
	// Get All records
	public List<TaskEntity> getAllLattice(){
		List<TaskEntity> l1=new ArrayList<TaskEntity> ();
		task.findAll().forEach(l2->l1.add(l2));
		return l1;
	}
	// save the paitent
	public void save(TaskEntity l1) {
		task.save(l1);
		
	}
	// update a record
	public void update(TaskEntity l1,int liid) {
		task.save(l1);
	}
	// delete a record
	public void delete(long id) {
		task.deleteById((long) id);
		
	}
	
}
