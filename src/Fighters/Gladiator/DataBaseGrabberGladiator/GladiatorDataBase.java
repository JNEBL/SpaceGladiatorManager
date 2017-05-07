package Fighters.Gladiator.DataBaseGrabberGladiator;

import Fighters.Gladiator.Base.Gladiator;
import Fighters.Gladiator.GladiatorDataBase.Human;
import Fighters.Gladiator.GladiatorDataBase.Vampire;

/**
 * Created by jnebl on 5/7/2017.
 */
public class GladiatorDataBase {
    public static Gladiator getHumanCharacter(){
        return new Human();
    }
    public static Gladiator getVampireCharacter(){
        return new Vampire();
    }
}
