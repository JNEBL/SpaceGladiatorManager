package World.Match;

import Fighters.Gladiator.Base.Gladiator;
import World.Tournament.Team;

/**
 * Created by student5 on 5/23/17.
 */
public class MatchResult {
    Gladiator gladiatorWinner,gladiatorLoser;
    public MatchResult(Gladiator winner,Gladiator loser){
        this.gladiatorWinner = winner;
        this.gladiatorLoser = loser;
    }

    public Gladiator getGladiatorLoser() {
        return gladiatorLoser;
    }

    public Gladiator getGladiatorWinner() {
        return gladiatorWinner;
    }
}
