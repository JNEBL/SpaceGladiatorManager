package World.Galaxy.Star.SpacePort;

import World.Galaxy.Star.Stars.Star;

/**
 * Created by student5 on 5/11/17.
 */
public class SpaceStation {
    Star star;
    int distanceFromStar;

    public SpaceStation(Star star){
        this.star = star;
        distanceFromStar = (int) (Math.random() * 900000 + 100000);
    }
}
