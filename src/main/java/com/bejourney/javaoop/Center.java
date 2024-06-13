package com.bejourney.javaoop;

public class Center {
    private String name ;

    public Center(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
   }

   public void setName (String name){
        this.name = name;
   }

    public void showName(){
        System.out.println("Name: "+ name);
    }
}
