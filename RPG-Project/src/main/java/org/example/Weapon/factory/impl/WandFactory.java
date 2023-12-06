package org.example.Weapon.factory.impl;

import org.example.Weapon.entity.Weapon;
import org.example.Weapon.entity.impl.Wand;
import org.example.Weapon.factory.WeaponFactory;

public class WandFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Wand();
    }

    @Override
    public Weapon createWeapon(int damage) {
        return new Wand(damage);
    }
}
