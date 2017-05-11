package Fighters.Gladiator.DataBaseGrabberGladiator;

import Fighters.Gladiator.Base.Gladiator;
import Fighters.Gladiator.GladiatorDataBase.GeluShaal;
import Fighters.Gladiator.GladiatorDataBase.Human;
import Fighters.Gladiator.GladiatorDataBase.SerpereAgere;
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
    public static  Gladiator getGeluShaalCharacter(){
        return new GeluShaal();
    }
    public static Gladiator getSerpereAgere(){
        return new SerpereAgere();
    }
}
