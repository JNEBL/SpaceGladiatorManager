package World.Galaxy.Travel;

import World.Galaxy.Stars.Stars.Stars;

/**
 * Created by jnebl on 5/12/2017.
 */
public class HyperSpaceLanes {
    private Stars destination, origin;
    private int travelDistance;
    public HyperSpaceLanes(Stars origin, Stars destination){
        this.origin = origin; this.destination = destination;
//        System.out.println("hyperspace lane created from: \n"+origin+"\nto: "+destination);
    }

    public Stars getDestination() {
        return destination;
    }
    public Stars getOrigin() {
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
