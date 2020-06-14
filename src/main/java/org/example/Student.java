package org.example;


import javax.persistence.Embeddable;

@Embeddable
public class Student {

    private String name;
    private String fname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                '}';
    }
}
