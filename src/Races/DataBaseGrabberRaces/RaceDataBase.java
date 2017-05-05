package Races.DataBaseGrabberRaces;

import Races.Base.Race;
import Races.RaceDataBase.Human;
import Races.RaceDataBase.Vampire;

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
