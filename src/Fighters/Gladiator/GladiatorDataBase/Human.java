package Fighters.Gladiator.GladiatorDataBase;

import Fighters.Gladiator.Base.Gladiator;
import Fighters.Races.DataBaseGrabberRaces.RaceDataBase;

/**
 * Created by jnebl on 5/7/2017.
 */
public class Human extends Gladiator{
    public Human(){
        super(RaceDataBase.getHumanRace());
    }
}
