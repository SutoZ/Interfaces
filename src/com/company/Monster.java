package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ICapability {

    private String name;
    private int hitPoints;
    private int strength;

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }


    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
    //    values.add(1, "", this.hitPoints);        //ERROR
     //   values.add(2, this.strength);
        return values;
    }

    @Override
    public void populate(List<String> values) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
