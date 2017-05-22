package World.Galaxy.Star.Planets.Moon;

import World.Galaxy.Star.Planets.Planets.Planet;
import World.Tournament.Arena;

/**
 * Created by student5 on 5/11/17.
 */
public class Moon {
    private Planet planet;
    private int distanceFromPlanet;
    private boolean hasArena;
    private Arena arena;
    public Moon(Planet planet){
        this.planet = planet;
        distanceFromPlanet = (int) (Math.random() * 500 + 100);
        if (Math.random() < .1){
            this.hasArena = true;
            this.arena = new Arena();
        }
        else {
            this.hasArena = false;
            this.arena = null;
        }
    }

    public int getDistanceFromPlanet() {
        return distanceFromPlanet;
    }

    public Arena getArena() {
        return arena;
    }

    public boolean isHasArena() {
        return hasArena;
    }

    public Planet getPlanet() {
        return planet;
    }
}
