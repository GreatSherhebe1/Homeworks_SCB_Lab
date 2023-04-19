package com.example.homeworks.beans.palace;

import com.example.homeworks.beans.rank.Communist;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Marxismus extends CollectivePalace{

    public Marxismus(@Qualifier(value = "marxist") Communist commander,
                     @Qualifier(value = "marxist") Communist secretary){
        super("Marxismus", commander, secretary);
    }
}
