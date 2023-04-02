package com.example.homeworks.JSONFactory;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


@Getter
@Setter
public class JSONCreator {

    private JSONObject jsonObject;

    public JSONCreator() throws JSONException {

        var info = new JSONObject();
        info.put("date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

        var json = new JSONObject();
        json.put("price", String.format("%.2f", new Random().nextDouble(100, 200)));
        json.put("info", info);

        this.jsonObject = json;
    }
}
