package World.Tournament;

import java.util.ArrayList;

/**
 * Created by student5 on 5/22/17.
 */
public class League {
    ArrayList<Team> teams = new ArrayList<>();
    private int prestige;
    public League(){
        this.prestige = (int) (Math.random() * 10000) + 1;
    }

    public int getPrestige() {
        return prestige;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }
}
