package classes.characters;

import classes.AttackTypes;

public class Healer extends CharacterClass {
    public Healer(String name) {
        this.setLevel(1);
        this.setHealthPoints(60);
        this.setManaPoints(150);
        this.setMaxHealthPoints(60);
        this.setMaxManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackTypes.MAGICAL_RANGED);
        this.setAttackAmount(2);
    }
    public Healer(String name, int level) {
        this.setLevel(level);
        this.setHealthPoints(60 + (this.getLevel() - 1)*20);
        this.setManaPoints(150);
        this.setMaxHealthPoints(60 + (this.getLevel() - 1)*20);
        this.setMaxManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackTypes.MAGICAL_RANGED);
        this.setAttackAmount(2 + (this.getLevel() - 1));
    }
}

