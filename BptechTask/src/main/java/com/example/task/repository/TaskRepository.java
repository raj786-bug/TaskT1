package com.example.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long>{

}
