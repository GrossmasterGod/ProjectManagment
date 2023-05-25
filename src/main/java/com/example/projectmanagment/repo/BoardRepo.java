package com.example.projectmanagment.repo;

import com.example.projectmanagment.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepo extends CrudRepository<Board,Long> {

}
