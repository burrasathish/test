package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Students {

    @Id
    private int sid;
    private String name;
    private int marks;

    @OneToMany(mappedBy = "students")
    private Collection<Laptoop> laptoop=new ArrayList<>();

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Collection<Laptoop> getLaptoop() {
        return laptoop;
    }

    public void setLaptoop(List<Laptoop> laptoop) {
        this.laptoop = laptoop;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollno=" + sid +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

}
