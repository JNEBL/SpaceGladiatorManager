package Fighters.Gladiator.GladiatorDataBase;

import Fighters.Gladiator.Base.Gladiator;
import Fighters.Races.DataBaseGrabberRaces.RaceDataBase;

/**
 * Created by jnebl on 5/7/2017.
 */
public class Vampire extends Gladiator{
    public Vampire(){
        super(RaceDataBase.getVampireRace());
    }
}
