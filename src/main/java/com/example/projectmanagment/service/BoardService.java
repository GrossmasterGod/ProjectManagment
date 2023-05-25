package com.example.projectmanagment.service;

import com.example.projectmanagment.model.Board;
import com.example.projectmanagment.repo.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
private final BoardRepo boardRepo;
    @Autowired
    public BoardService(BoardRepo boardRepo) {
        this.boardRepo = boardRepo;
    }

    public Board addBoard(Board board){
        return boardRepo.save(board);
    }

    public Board updateBoard(Board board){
        return boardRepo.save(board);
    }
}
