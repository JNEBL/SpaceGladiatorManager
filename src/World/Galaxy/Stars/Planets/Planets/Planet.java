package World.Galaxy.Stars.Planets.Planets;

import World.Galaxy.Stars.Planets.Moon.Moon;

import java.util.ArrayList;

/**
 * Created by student5 on 5/11/17.
 */
public class Planet {
    private int megaMileRadius;
    private ArrayList<Moon> moons = new ArrayList<>();
    public Planet(){
        
        //radius of earth is 4000
        //unit to measure planet size could be megamiles which are 1000 miles per megamile (would allow really big planets without dealing with overflows)
        //lets call most standart sized plaents around 3000 to 10000 miles in radius
        //big planets like ice and rock giants are 10000 to 25000 miles. (36 megamiles)
        //dwarf planets are 1500 miles to 3000 miles.
        //this should be the general standart of gas giants. should be 25000 to 45000
        //moons should be around 1 megamile. minor moons are labled as < 1 megamile.
        //moons should be minable. same with planets.
        //the bigger a planet the more moons they will have
        for (int x = 0;x < Math.random() * 36;x++){
            moons.add(new Moon());
        }
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }
}
