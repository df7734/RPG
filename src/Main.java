import classes.Party;
import classes.characters.Archer;
import classes.characters.Healer;
import classes.characters.Mage;
import classes.characters.Warrior;
import classes.dungeons.Dungeon;

public class Main {
    public static void main(String[] args) {
            Party party = new Party(new Mage("Gandalf", 2), new Warrior("Aragorn", 3),
                          new Archer("Legolas", 5), new Healer("Radogast"));
            party.info();
            Dungeon dungeon = new Dungeon(2);
            if(party.enterDungeon(dungeon)){
                 party.setDungeon(dungeon);
                 party.runDungeon();
            }
        else System.out.println("Game over");
    }
}
