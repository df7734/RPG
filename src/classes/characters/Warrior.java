package classes.characters;

import classes.AttackTypes;

public class Warrior extends CharacterClass {
    public Warrior(String name) {
        this.setLevel(1);
        this.setHealthPoints(100);
        this.setManaPoints(50);
        this.setMaxHealthPoints(100);
        this.setMaxManaPoints(50);
        this.setName(name);
        this.setAttackType(AttackTypes.PHYSICAL);
        this.setAttackAmount(5);
    }
    public Warrior(String name, int level) {
        this.setLevel(level);
        this.setHealthPoints(100 + (this.getLevel() - 1)*30);
        this.setManaPoints(50);
        this.setMaxHealthPoints(100+ (this.getLevel() - 1)*15);
        this.setMaxManaPoints(50);
        this.setName(name);
        this.setAttackType(AttackTypes.PHYSICAL);
        this.setAttackAmount(5+ (this.getLevel() - 1)*2);
    }
}
