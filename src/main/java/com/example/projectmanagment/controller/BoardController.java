package com.example.projectmanagment.controller;

import com.example.projectmanagment.model.Board;
import com.example.projectmanagment.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/add")
    public ResponseEntity<Board> addBoard(@RequestBody Board board) {
        Board newBoard = boardService.addBoard(board);
        return new ResponseEntity<>(newBoard, HttpStatus.CREATED);
    }
}
