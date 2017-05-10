package Fighters.Races.DataBaseGrabberRaces;

import Fighters.Races.Base.Race;
import Fighters.Races.RaceDataBase.*;


/**
 * Created by student5 on 5/5/17.
 */
public class RaceDataBase {
    public static Race getHumanRace(){
        return new Human();
    }
    public static Race getVampireRace(){
        return new Vampire();
    }
    public static Race getGeluShaalRace(){
        return new GeluShaal();
    }
    public static Race getSerpereAgereRace(){
        return new SerpereAgere();
    }
}
