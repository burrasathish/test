package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    private int lid;
    private Student lname;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


    public Student getLname() {
        return lname;
    }

    public void setLname(Student lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", name='" + lname + '\'' +
                '}';
    }
}
