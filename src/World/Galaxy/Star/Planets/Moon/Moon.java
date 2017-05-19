package World.Galaxy.Star.Planets.Moon;

import World.Galaxy.Star.Planets.Planets.Planet;

/**
 * Created by student5 on 5/11/17.
 */
public class Moon {
    Planet planet;
    int distanceFromPlanet;
    public Moon(Planet planet){
        this.planet = planet;
        distanceFromPlanet = (int) (Math.random() * 500 + 100);
    }
}
