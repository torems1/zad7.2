package com.company;

public class Person {
    private String name;
    private String lastName;
    private String secondName;
    public Person(String name,String lastName,String secondName){
        if(name.isEmpty()){
            this.name=name.trim();
        }else{
            this.name=name;
        }
        this.lastName=lastName;
        if(secondName.isEmpty()){
            this.secondName=secondName.trim();
        }else {
            this.secondName=secondName;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getSecondName(){
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void say(){
        System.out.println("Hello, I am "+lastName+" "+ name + " "+secondName
        );
    }
}
