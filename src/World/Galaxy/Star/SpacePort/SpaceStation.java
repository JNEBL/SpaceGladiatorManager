package World.Galaxy.Star.SpacePort;

import Calculations.Unigen;
import World.Galaxy.Star.Stars.Star;
import World.Galaxy.Travel.WormHole;
import World.Tournament.Arena;

/**
 * Created by student5 on 5/11/17.
 */
public class SpaceStation {
    private Star star;
    private int distanceFromStar;
    private boolean hasArena;
    private Arena arena;
    public WormHole wormHole;
    public SpaceStation(Star star){
        this.star = star;
        distanceFromStar = (int) (Math.random() * 900000 + 100000);
        if (Math.random() < .7){
            this.hasArena = true;
            this.arena = new Arena();
        }
        else {
            this.hasArena = false;
            this.arena = null;
        }
        if (Math.random() < .25){
            Unigen.universe.addWormhole(this);

        }
    }

    public int getDistanceFromStar() {
        return distanceFromStar;
    }

    public Star getStar() {
        return star;
    }

    public Arena getArena() {
        return arena;
    }

    public boolean isHasArena() {
        return hasArena;
    }
}
