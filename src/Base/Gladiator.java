package Base;

import Races.Race;

import java.util.ArrayList;

/**
 * Created by student5 on 5/4/17.
 */
public class Gladiator {
    private Race race;
    private ArrayList<Integer> dexterity = new ArrayList<>();
    private ArrayList<Integer> strength = new ArrayList<>();
    private ArrayList<Integer> agility = new ArrayList<>();
    public Gladiator(Race race){
        this.race = race;
    }
}
