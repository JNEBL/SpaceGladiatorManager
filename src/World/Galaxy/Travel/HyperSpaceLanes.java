package World.Galaxy.Travel;

import World.Galaxy.Star.Stars.Star;

/**
 * Created by jnebl on 5/12/2017.
 */
public class HyperSpaceLanes {
    private Star destination, origin;
    private int travelDistance;
    public HyperSpaceLanes(Star origin, Star destination){
        this.origin = origin; this.destination = destination;
//        System.out.println("hyperspace lane created from: \n"+origin+"\nto: "+destination);
    }

    public Star getDestination() {
        return destination;
    }
    public Star getOrigin() {
        return origin;
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
