package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.Main.readValues;

public class Player implements ICapability {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public String getName() {
        return name;
    }

    public void setHitPoints(int value) {
        this.hitPoints = value;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public Player(String name, int hitPoints, int strength, String weapon) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, "" + this.weapon);

        return values;
    }

    @Override
    public void populate(List<String> savedValues) {
        if (savedValues != null && savedValues.size() >= 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }



    @Override
    public String toString() {
        return "Player{ " + "name " + name + '\'' + ", hitPoints= " + hitPoints + ", strength= " + strength
                + ", weapon " + weapon + '\'' + "}";
    }
}
