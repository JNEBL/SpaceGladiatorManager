package World.Galaxy.Stars.Planets.Planets;

import World.Galaxy.Stars.Planets.Moon.Moon;

import java.util.ArrayList;

/**
 * Created by student5 on 5/11/17.
 */
public class Planet {
    ArrayList<Moon> moons = new ArrayList<>();
    public Planet(){
        for (int x = 0;x < Math.random() * 36;x++){
            moons.add(new Moon());
        }
    }
}
