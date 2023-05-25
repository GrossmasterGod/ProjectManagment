package com.example.projectmanagment.service;

import com.example.projectmanagment.model.Board;
import com.example.projectmanagment.model.Task;
import com.example.projectmanagment.repo.TaskRepo;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
    private final TaskRepo taskRepo;

    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }
    public Task addTask(Task task){
        return taskRepo.save(task);
    }
}
