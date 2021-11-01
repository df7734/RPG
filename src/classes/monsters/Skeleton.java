package classes.monsters;

import classes.AttackTypes;

public class Skeleton extends MonsterClass {
    public Skeleton(int level) {
        this.setLevel(level);
        this.setHealthPoints(50*level);
        this.setManaPoints(50);
        this.setMaxHealthPoints(75*level);
        this.setMaxManaPoints(50);
        this.setAttackType(AttackTypes.PHYSICAL);
        this.setAttackAmount(10*level);
    }
}
