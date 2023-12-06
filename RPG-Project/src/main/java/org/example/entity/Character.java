package org.example.entity;

public abstract class Character {
    private String weapon;
    // TODO: 05/12/2023 Hashmap physicalAttribute
    private String physicalAttribute;

    public Character(String weapon, String physicalAttribute) {
        this.weapon = weapon;
        this.physicalAttribute = physicalAttribute;
    }
}
