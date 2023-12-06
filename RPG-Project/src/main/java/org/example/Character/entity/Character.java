package org.example.Character.entity;

import org.example.Weapon.entity.Weapon;
import org.example.Weapon.factory.WeaponFactory;

import java.util.Map;

public abstract class Character {
    protected WeaponFactory weaponFactory;
    protected Weapon weapon;
    protected Map<String, Integer> physicalAttributes;

    protected Character(Builder builder) {
        this.weaponFactory = builder.weaponFactory;
        this.weapon = this.weaponFactory.createWeapon();
        this.physicalAttributes = Map.ofEntries(
                Map.entry("strength", 10),
                Map.entry("dexterity", 10),
                Map.entry("agility", 10),
                Map.entry("intelligence", 10),
                Map.entry("perception", 10)
        );
    }

    @Override
    public String toString() {
        return "weapon=" + weapon +
                ", physicalAttributes=" + physicalAttributes;
    }

    public abstract static class Builder {
        private WeaponFactory weaponFactory;

        public Builder weaponFactory(WeaponFactory weaponFactory){
            this.weaponFactory = weaponFactory;
            return this;
        }

        public abstract Character build();
    }
}
