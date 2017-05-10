package Fighters.Races.RaceDataBase;

import Fighters.Races.Base.Race;
import Fighters.Races.Base.RaceCommonStaticMethods;

/**
 * Created by student5 on 5/5/17.
 */
public class Vampire extends Race {
    public Vampire(){
        super(RaceCommonStaticMethods.baseValue(1),RaceCommonStaticMethods.baseValue(1),
                RaceCommonStaticMethods.baseValue(1),RaceCommonStaticMethods.baseValue(1),
                RaceCommonStaticMethods.baseValue(1),RaceCommonStaticMethods.baseValue(1),
                RaceCommonStaticMethods.baseValue(1));
    }
}
