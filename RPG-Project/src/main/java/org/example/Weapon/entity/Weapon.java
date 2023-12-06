package org.example.Weapon.entity;

public abstract class Weapon {
    private int damage;

    public Weapon() {
    }

    public Weapon(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "damage=" + damage;
    }
}
