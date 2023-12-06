package org.example.Character.entity.impl;

import org.example.Character.entity.Character;
import org.example.Weapon.factory.impl.SwordFactory;

public class Warrior extends Character {
    private Warrior(WarriorBuilder warriorBuilder) {
        super(warriorBuilder);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                super.toString() +
                '}';
    }

    public static class WarriorBuilder extends Character.Builder {
        public Builder swordFactory(SwordFactory swordFactory) {
            return super.weaponFactory(swordFactory);
        }

        @Override
        public Warrior build() {
            return new Warrior(this);
        }
    }
}
