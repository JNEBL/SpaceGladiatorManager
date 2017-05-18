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
        System.out.println("started world generation");
        Universe universe = new Universe(2);
        System.out.println("ended world generation");

        System.out.println(universe.getNumberOfStars());
        System.out.println(universe.getNumberOfPlanets());
        System.out.println(universe.getNumberOfMoons());
        System.out.println(universe.getNumberOfSpaceStations());
        System.out.println(universe.getNumberOfHyperSpaceLanes());
        System.out.println(universe.getGalaxyAttempts());
//        Window window = new Window();
//        window.addMouseListener(new Mouse());
//        window.refreshDisplay();
//        Window.getMenu().displayAll();
    }
}
