package Fighters.Gladiator.GladiatorDataBase;

import Fighters.Gladiator.Base.Gladiator;
import Fighters.Races.DataBaseGrabberRaces.RaceDataBase;

/**
 * Created by student5 on 5/10/17.
 */
public class GeluShaal extends Gladiator{
    public GeluShaal(){
        super(RaceDataBase.getGeluShaalRace());
    }
}
