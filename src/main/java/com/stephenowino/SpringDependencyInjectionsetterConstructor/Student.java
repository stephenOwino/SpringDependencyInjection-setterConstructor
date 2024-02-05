package com.stephenowino.SpringDependencyInjectionsetterConstructor;

public class Student {

    private String name;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void StudentName(){
        System.out.println("My name is :" + name + " With an id of: " + id);
    }
}
