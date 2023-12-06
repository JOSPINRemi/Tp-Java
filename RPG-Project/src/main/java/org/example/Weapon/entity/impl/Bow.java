package org.example.Weapon.entity.impl;

import org.example.Weapon.entity.Weapon;

public class Bow extends Weapon {

    public Bow() {
    }

    public Bow(int damage) {
        super(damage);
    }

    @Override
    public String toString() {
        return "Bow{" + super.toString() + "}";
    }

    public void snipe(){

    }
}
