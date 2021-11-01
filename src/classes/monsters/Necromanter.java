package classes.monsters;

import classes.AttackTypes;

public class Necromanter extends MonsterClass{
    public Necromanter(int level) {
        this.setLevel(level);
        this.setHealthPoints(200 + (level-1)*75);
        this.setManaPoints(500 + (level-1)*200);
        this.setMaxHealthPoints(300 + (level-1)*100);
        this.setMaxManaPoints(1000 + (level-1)*300);
        this.setAttackType(AttackTypes.MAGICAL_RANGED);
        this.setAttackAmount(7*level);
    }
}
