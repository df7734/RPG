package classes.characters;

import classes.AttackTypes;

public class Archer extends CharacterClass {
    public Archer(String name) {

        this.setLevel(1);
        this.setHealthPoints(75);
        this.setManaPoints(50);
        this.setMaxHealthPoints(75);
        this.setMaxManaPoints(50);
        this.setName(name);
        this.setAttackType(AttackTypes.PHYSICAL_RANGED);
        this.setAttackAmount(7);
    }

    public Archer(String name, int level) {

        this.setLevel(level);
        this.setHealthPoints(75 + (this.getLevel() - 1)*25);
        this.setManaPoints(50);
        this.setMaxHealthPoints(75 + (this.getLevel() - 1)*25);
        this.setMaxManaPoints(50);
        this.setName(name);
        this.setAttackType(AttackTypes.PHYSICAL_RANGED);
        this.setAttackAmount(7 + (this.getLevel() - 1)*2);
    }
}
