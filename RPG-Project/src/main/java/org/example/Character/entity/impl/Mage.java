package org.example.Character.entity.impl;

import org.example.Character.entity.Character;
import org.example.Weapon.factory.impl.WandFactory;

public class Mage extends Character {
    private Mage(MageBuilder mageBuilder) {
        super(mageBuilder);
    }

    @Override
    public String toString() {
        return "Mage{" +
                super.toString() +
                '}';
    }

    public static class MageBuilder extends Character.Builder {
        public Builder wandFactory(WandFactory wandFactory) {
            return super.weaponFactory(wandFactory);
        }

        @Override
        public Mage build() {
            return new Mage(this);
        }
    }
}
