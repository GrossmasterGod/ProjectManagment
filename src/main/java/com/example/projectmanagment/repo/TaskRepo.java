package com.example.projectmanagment.repo;

import com.example.projectmanagment.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Task,Long> {

}
