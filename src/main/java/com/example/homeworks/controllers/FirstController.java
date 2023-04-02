package com.example.homeworks.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@Controller
public class FirstController {
    @GetMapping("/getHeaders")
    public ResponseEntity<String> GetHeaders(@RequestHeader Map<String, String> headers){
        ObjectMapper headersJSON = new ObjectMapper();
        String json;
        try {
            json = headersJSON.writeValueAsString(headers);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return new ResponseEntity<>(json, HttpStatus.OK);
    }
}
