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
        System.out.println("Stars =" + universe.getStars().size());
        int temp = 0;
        for (int x = 0;x < universe.getStars().size();x++){
            for (int y = 0;y < universe.getStars().get(x).getPlanets().size();x++){
                temp += 1;
            }
        }
        System.out.println("Planets = " + temp);
        temp = 0;
        for (int x = 0;x < universe.getStars().size();x++){
            for (int y = 0;y < universe.getStars().get(x).getPlanets().size();x++){
                for (int z = 0;z < universe.getStars().get(x).getPlanets().get(y).getMoons().size();x++){
                    temp += 1;
                }
            }
        }
        System.out.println("Moons =" + temp);
    }
}
