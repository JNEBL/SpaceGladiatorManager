package World.Tournament;

import Player.Player.Player;

import java.util.ArrayList;
import java.util.Currency;

/**
 * Created by student5 on 5/22/17.
 */
public class League {
    ArrayList<Player> teams = new ArrayList<>();
    private int prestige;
    private ArrayList<Currency> prizeMoney = new ArrayList<>();
    public League(){
        this.prestige = (int) (Math.random() * 10000) + 1;
    }

    public int getPrestige() {
        return prestige;
    }

    public ArrayList<Player> getTeams() {
        return teams;
    }

    public void addTeamToTournament(Player team){
        teams.add(team);
    }


}
