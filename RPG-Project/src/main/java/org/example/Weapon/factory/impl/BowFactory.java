package org.example.Weapon.factory.impl;

import org.example.Weapon.entity.Weapon;
import org.example.Weapon.entity.impl.Bow;
import org.example.Weapon.factory.WeaponFactory;

public class BowFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Weapon createWeapon(int damage) {
        return new Bow(damage);
    }
}
