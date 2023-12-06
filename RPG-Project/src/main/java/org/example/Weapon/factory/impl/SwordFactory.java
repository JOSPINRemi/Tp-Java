package org.example.Weapon.factory.impl;

import org.example.Weapon.entity.Weapon;
import org.example.Weapon.entity.impl.Sword;
import org.example.Weapon.factory.WeaponFactory;

public class SwordFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Weapon createWeapon(int damage) {
        return new Sword(damage);
    }
}
