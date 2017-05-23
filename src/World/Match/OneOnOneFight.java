package World.Match;

import Calculations.Calculation;
import Calculations.FightMath;
import Fighters.Gladiator.Base.Gladiator;

/**
 * Created by student5 on 5/23/17.
 */
public class OneOnOneFight {
    MatchResult matchResult;
    public OneOnOneFight(Gladiator gladiator1,Gladiator gladiator2){
        this.matchResult = FightMath.oneOnOneFight(gladiator1,gladiator2);
    }

}
