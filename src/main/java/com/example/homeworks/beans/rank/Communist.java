package com.example.homeworks.beans.rank;

import lombok.Getter;

@Getter
public abstract class Communist {

    protected String name;
    protected Double partyPower;

    public Communist(String name, Double partyPower){
        this.name = name;
        this.partyPower = partyPower;
    }
}
