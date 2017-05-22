package World.Galaxy.Travel;

import World.Galaxy.Star.SpacePort.SpaceStation;

import java.util.ArrayList;

/**
 * Created by student5 on 5/22/17.
 */
public class WormHolePortal {
    private ArrayList<SpaceStation> wormHoleLocations = new ArrayList<>();
    public WormHolePortal(){

    }

    public ArrayList<SpaceStation> getWormHoleLocations() {
        return wormHoleLocations;
    }
    public void addSpaceStationLocation(SpaceStation spaceStation){
        wormHoleLocations.add(spaceStation);
    }
}
