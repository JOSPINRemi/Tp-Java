package org.example.Weapon.entity.impl;

import org.example.Weapon.entity.Weapon;

public class Wand extends Weapon {

    public Wand() {
    }

    @Override
    public String toString() {
        return "Wand{" + super.toString() + "}";
    }

    public Wand(int damage) {
        super(damage);
    }

    public void caste(){

    }
}
