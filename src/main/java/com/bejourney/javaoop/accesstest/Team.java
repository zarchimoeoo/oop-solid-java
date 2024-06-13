package com.bejourney.javaoop.accesstest;

public class Team {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createTeam(){
        System.out.println("This team is created by Organizer.");
    }
}
