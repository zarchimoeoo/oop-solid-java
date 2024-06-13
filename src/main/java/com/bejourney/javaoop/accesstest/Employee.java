package com.bejourney.javaoop.accesstest;

public class Employee extends OverTime {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getOverTimeInfo(){
        System.out.println(getName() + " will get OT money in this month.");
    }

}
