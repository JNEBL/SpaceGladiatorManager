package Fighters.Races.DataBaseGrabberRaces;

import Fighters.Races.Base.Race;
import Fighters.Races.RaceDataBase.*;


/**
 * Created by student5 on 5/5/17.
 */
public class RaceDataBase {
    public static Race getHumanCharacter(){
        return new Human();
    }
    public static Race getVampireCharacter(){
        return new Vampire();
    }
}
