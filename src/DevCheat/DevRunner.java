package DevCheat;

import Fighters.Gladiator.DataBaseGrabberGladiator.GladiatorDataBase;
import GameFrameWork.*;
import Player.Player.Player;
import World.Galaxy.Universe.Universe;

/**
 * Created by jnebl on 5/6/2017.
 */
public class DevRunner {
    public static void main(String args[]){
        Universe universe = new Universe(10000);
        System.out.println(universe.getNumberOfStars());
        System.out.println(universe.getNumberOfPlanets());
        System.out.println(universe.getNumberOfMoons());
        System.out.println(universe.getNumberOfSpaceStations());
        System.out.println(universe.getGalaxyAttempts());
    }
}
