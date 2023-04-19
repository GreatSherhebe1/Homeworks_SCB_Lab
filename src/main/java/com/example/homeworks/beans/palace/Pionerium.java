package com.example.homeworks.beans.palace;

import com.example.homeworks.beans.rank.Communist;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pionerium extends CollectivePalace{

    public Pionerium(@Qualifier(value = "comsomol") Communist commander,
                     @Qualifier(value = "pioner") Communist secretary){
        super("Pionerium", commander, secretary);

    }
}
