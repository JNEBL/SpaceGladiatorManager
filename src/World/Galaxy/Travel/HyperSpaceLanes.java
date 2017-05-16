package World.Galaxy.Travel;

import World.Galaxy.Stars.Stars.Stars;

/**
 * Created by jnebl on 5/12/2017.
 */
public class HyperSpaceLanes {
    private Stars destination;
    private int travelDistance;
    public HyperSpaceLanes(Stars destination){
        this.destination = destination;
    }

    public Stars getDestination() {
        return destination;
    }

    public int getTravelDistance() {
        return travelDistance;
    }
    public void setTravelDistance(int travelDistance) {
        this.travelDistance = travelDistance;
    }

    @Override
    public String toString() {
        return "" + destination;
    }
}
