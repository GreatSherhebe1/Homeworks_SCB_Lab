package com.example.homeworks.beans.palace;

import com.example.homeworks.beans.rank.Communist;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Comsomolstvo extends CollectivePalace{

    public Comsomolstvo(@Qualifier(value = "marxist") Communist commander,
                        @Qualifier(value = "comsomol") Communist secretary){
        super("Comsomolstvo", commander, secretary);
    }
}
