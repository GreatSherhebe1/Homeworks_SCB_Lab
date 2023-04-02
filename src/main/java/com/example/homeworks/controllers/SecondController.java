package com.example.homeworks.controllers;

import com.example.homeworks.JSONFactory.JSONCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class SecondController {

    @GetMapping("/getJSON")
    public ResponseEntity<String> GetJSON(@Qualifier(value = "createjson") JSONCreator jsonCreator)
            throws JSONException {
        jsonCreator.getJsonObject().getJSONObject("info").put("id", new Random().nextInt(1, 1000));
        return new ResponseEntity<>(jsonCreator.getJsonObject().toString(), HttpStatus.OK);
    }
}
