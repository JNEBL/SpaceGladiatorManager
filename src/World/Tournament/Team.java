package World.Tournament;

import Fighters.Gladiator.Base.Gladiator;

import java.util.ArrayList;

/**
 * Created by student5 on 5/22/17.
 */
public class Team {
    private String name;
    private ArrayList<Gladiator> gladiators = new ArrayList<>();
    private int lifeTimeWins,LifeTimeLosses,LeagueLosses,LeagueWins;
    public Team(){

    }

    public ArrayList<Gladiator> getGladiators() {
        return gladiators;
    }
    public void addGladiator(Gladiator gladiator){
        gladiators.add(gladiator);
    }
    public void removeGladiator(int index){
        if (index > -1)
            gladiators.remove(index);
    }
}
