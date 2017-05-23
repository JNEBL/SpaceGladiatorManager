package World.Galaxy.Star.Planets.Moon;

import World.Galaxy.Star.Planets.Planets.Planet;
import World.Tournament.Arena;

/**
 * Created by student5 on 5/11/17.
 */
public class Moon {
    private Planet planet;
    private int distanceFromPlanet;
    private Arena arena;
    String moonType; //rock or ice
    public Moon(Planet planet){
        this.planet = planet;
        distanceFromPlanet = (int) (Math.random() * 500 + 100);
        if (Math.random() < .1){
            this.arena = new Arena();
        }
        else {
            this.arena = null;
        }
        if(planet.getDistanceFromStar()>500 && Math.random() > .65) moonType = "ice";
        else moonType = "rock";
    }

    public int getDistanceFromPlanet() {
        return distanceFromPlanet;
    }

    public Arena getArena() {
        return arena;
    }

    public Planet getPlanet() {
        return planet;
    }
}
