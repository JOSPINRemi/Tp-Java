package org.example.Weapon.factory;

import org.example.Weapon.entity.Weapon;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon();

    public abstract Weapon createWeapon(int damage);
}
