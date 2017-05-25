package World.Galaxy.Travel;

import Calculations.Unigen;
import World.Galaxy.Star.SpacePort.SpaceStation;

import java.util.ArrayList;

/**
 * Created by student5 on 5/22/17.
 */
public class WormHole {
    private SpaceStation spaceStation;
    public WormHole(SpaceStation spaceStation){
        this.spaceStation = spaceStation;
        spaceStation.wormHole = this;
    }

    public SpaceStation getWormHoleLocation() {
        return spaceStation;
    }
}
