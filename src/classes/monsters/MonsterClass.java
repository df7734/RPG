package classes.monsters;

import classes.AttackTypes;
import classes.BaseClass;

public abstract class MonsterClass implements BaseClass {
    private int maxHealthPoints;
    private int maxManaPoints;
    private int healthPoints;
    private int manaPoints;
    private int level;
    private AttackTypes attackType;
    private int attackAmount;
    private String name;
    public AttackTypes getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackTypes attackType) {
        this.attackType = attackType;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    @Override
    public void attack() {

    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    @Override
    public void restoreHealth(int amount) {
        setHealthPoints(this.healthPoints + amount);
    }

    @Override
    public void loseHealth(int amount) {
        setHealthPoints((this.healthPoints - amount));
    }

    @Override
    public void restoreMana(int amount) {
        setManaPoints((this.manaPoints + amount));
    }

    @Override
    public void loseMana(int amount) {
        setManaPoints((this.manaPoints - amount));
    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {
        System.out.println("Name: " + this.name + "\nCurrentHp: " + this.healthPoints + "\nCurrentMP: " + this.manaPoints + "\nCurrentLvl: " + this.level);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if(healthPoints<0) this.healthPoints = 0;
        else if(healthPoints>this.maxHealthPoints) this.healthPoints = maxHealthPoints;
        this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        if(manaPoints<0) this.manaPoints = 0;
        else if(manaPoints>this.maxManaPoints) this.manaPoints = maxManaPoints;
        this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level<0) System.out.println("We can't lose level!");
        this.level = level;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        if(attackAmount<0) System.out.println("We can't have attack rate below aero!");
        this.attackAmount = attackAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }
}
