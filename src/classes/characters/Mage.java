package classes.characters;

import classes.AttackTypes;

public class Mage extends CharacterClass {
    public Mage(String name) {
        this.setLevel(1);
        this.setHealthPoints(50);
        this.setManaPoints(150);
        this.setMaxHealthPoints(50);
        this.setMaxManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackTypes.MAGICAL_RANGED);
        this.setAttackAmount(9);
    }
    public Mage(String name, int level) {
        this.setLevel(level);
        this.setHealthPoints(50 + (this.getLevel() - 1)*15);
        this.setManaPoints(150);
        this.setMaxHealthPoints(50 + (this.getLevel() - 1)*15);
        this.setMaxManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackTypes.MAGICAL_RANGED);
        this.setAttackAmount(9 + (this.getLevel() - 1)*3);
    }
}
