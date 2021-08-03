package com.company;

public class WaterMonster extends Monster{

    public WaterMonster(String name){
        super(name);
    }

    protected String attack(){
        return "Attack with water!";
    }
}
