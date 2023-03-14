package com.example.homeworks.beans.palace;

import com.example.homeworks.beans.rank.Communist;
import lombok.Getter;
import lombok.NonNull;

import javax.annotation.PostConstruct;

@Getter
public abstract class CollectivePalace {

    @NonNull
    protected String name;

    @NonNull
    protected Communist commander;
    @NonNull
    protected Communist secretary;

    public CollectivePalace(String name, Communist commander, Communist secretary){
        this.name = name;
        this.commander = commander;
        this.secretary = secretary;
        System.out.printf("Communists at the %s:\n", name);
        System.out.printf("%s\n", commander.getName());
        System.out.printf("%s\n", secretary.getName());
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("All communists are at their place\n");
    }

    public double GetTotalPalacePower(){
        return commander.getPartyPower() + secretary.getPartyPower();}
}
