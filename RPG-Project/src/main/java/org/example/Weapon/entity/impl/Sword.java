package org.example.Weapon.entity.impl;

import org.example.Weapon.entity.Weapon;

public class Sword extends Weapon {

    public Sword() {
    }

    public Sword(int damage) {
        super(damage);
    }

    @Override
    public String toString() {
        return "Sword{" + super.toString() + "}";
    }

    public void slash(){

    }
}
