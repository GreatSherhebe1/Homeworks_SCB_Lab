package com.example.homeworks.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/summonHandler")
    public String summonError() throws Exception {
        throw new Exception("check handler");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> customExceptionHandler(Exception e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_GATEWAY);
    }
}
