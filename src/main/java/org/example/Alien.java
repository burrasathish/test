package org.example;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Alien {
    @Id
    private int aid;
    private String name;
    @OneToMany(mappedBy = "alien", fetch = FetchType.EAGER)
    private Collection<Laptoop> laptoops=new ArrayList<>();

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Laptoop> getLaptoops() {
        return laptoops;
    }

    public void setLaptoops(Collection<Laptoop> laptoops) {
        this.laptoops = laptoops;
    }


}
