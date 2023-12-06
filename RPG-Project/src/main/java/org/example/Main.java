package org.example;

import org.example.Character.entity.Character;
import org.example.Character.entity.impl.Archer;
import org.example.Character.entity.impl.Mage;
import org.example.Character.entity.impl.Warrior;
import org.example.Weapon.factory.impl.BowFactory;
import org.example.Weapon.factory.impl.SwordFactory;
import org.example.Weapon.factory.impl.WandFactory;

public class Main {
    public static void main(String[] args) {
        Character archer = new Archer.ArcherBuilder().bowFactory(new BowFactory()).build();
        Character mage = new Mage.MageBuilder().wandFactory(new WandFactory()).build();
        Character warrior = new Warrior.WarriorBuilder().swordFactory(new SwordFactory()).build();
        System.out.println(archer);
        System.out.println(mage);
        System.out.println(warrior);
    }
}