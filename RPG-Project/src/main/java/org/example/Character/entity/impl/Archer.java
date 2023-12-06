package org.example.Character.entity.impl;

import org.example.Character.entity.Character;
import org.example.Weapon.factory.impl.BowFactory;

public class Archer extends Character {

    private Archer(ArcherBuilder archerBuilder) {
        super(archerBuilder);
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString() +
                '}';
    }

    public static class ArcherBuilder extends Character.Builder {
        public Builder bowFactory(BowFactory bowFactory) {
            return super.weaponFactory(bowFactory);
        }

        @Override
        public Archer build() {
            return new Archer(this);
        }
    }
}
