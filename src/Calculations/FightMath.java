package Calculations;

import Fighters.Gladiator.Base.Gladiator;
import World.Match.MatchResult;

/**
 * Created by student5 on 5/23/17.
 */
public class FightMath {
    public static MatchResult oneOnOneFight(Gladiator gladiator1,Gladiator gladiator2){
        if (Math.random() > .5)
            return new MatchResult(gladiator1,gladiator2);
        else
            return new MatchResult(gladiator1,gladiator2);

    }
}
