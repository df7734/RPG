package classes;

import classes.characters.CharacterClass;
import classes.dungeons.Dungeon;
import classes.monsters.MonsterClass;

public class Party {
    private CharacterClass[] partyMembers;
    private Dungeon dungeon;

    public Dungeon getDungeon() {
        return dungeon;
    }

    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
    public void runDungeon(){
        int summaryHealthPoints = 0;
        int summaryAttackPoints = 0;
        int dungeonHealth = 0;
        int dungeonAttack = 0;
        for (CharacterClass partyMember : partyMembers){
            summaryHealthPoints += partyMember.getHealthPoints();
            summaryAttackPoints += partyMember.getAttackAmount();
        }
        for (MonsterClass dungeonMonster : dungeon.getMonsters()){
            dungeonHealth += dungeonMonster.getHealthPoints();
            dungeonAttack += dungeonMonster.getAttackAmount();
        }
        System.out.println("Heroes health: " + summaryHealthPoints);
        System.out.println("Heroes attack: " + summaryAttackPoints);
        System.out.println("Monsters health: " + dungeonHealth);
        System.out.println("Monsters attack: " + dungeonAttack);

        for (CharacterClass partyMember : partyMembers){
            partyMember.levelUp();
        }
        System.out.println("_____________LVL_UP_____________");
        summaryAttackPoints = 0;
        summaryHealthPoints = 0;
        for (CharacterClass partyMember : partyMembers){
            summaryHealthPoints += partyMember.getHealthPoints();
            summaryAttackPoints += partyMember.getAttackAmount();
        }
        System.out.println("Heroes health: " + summaryHealthPoints);
        System.out.println("Heroes attack: " + summaryAttackPoints);

    }
    public Party(CharacterClass... members){
        partyMembers = new CharacterClass[members.length];
        for(int i=0; i<partyMembers.length; i++){
            partyMembers[i] = members[i];
        }
    }
    public boolean enterDungeon(Dungeon dungeon){
        return dungeon.open(this);

    }
    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }

    public void info(){
        for(CharacterClass partyMember : partyMembers){
            partyMember.info();
        }
    }
}
