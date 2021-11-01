package classes.dungeons;

import classes.Party;
import classes.monsters.MonsterClass;
import classes.monsters.Necromanter;
import classes.monsters.Skeleton;

import java.util.ArrayList;
import java.util.List;

public class Dungeon implements BasicDungeon {
    private boolean isOpened = false;
    private  List<MonsterClass> monsters = new ArrayList<>();

    public List<MonsterClass> getMonsters() {
        return monsters;
    }

    public Dungeon(int levelOfDungeon){
        Necromanter necromanter = new Necromanter(levelOfDungeon);
        monsters.add(necromanter);
        Skeleton skeleton = new Skeleton(levelOfDungeon);
        for(int i=0;i<levelOfDungeon*3; i++){
            monsters.add(skeleton);
        }


    }
    @Override
    public boolean open(Party party) {
        if(party.getPartyMembers().length < 3){
            System.out.println("Not enough party memebers");
            isOpened = false;
        }
        else{
            System.out.println("Welcome, heroes!");
            isOpened = true;
        }
        return isOpened;
    }
}
