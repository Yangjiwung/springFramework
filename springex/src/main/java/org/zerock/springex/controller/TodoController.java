package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @GetMapping("/list")
    public void list(){
        log.info("todo list........");

    }

    @GetMapping("/register")
    public void register(){
        log.info("todo register...........");
    }

    @PostMapping("/register")
    public void registerPost(){
        log.info("todo Post Register..........");
    }
}
