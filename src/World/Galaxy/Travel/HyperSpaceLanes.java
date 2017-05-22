package World.Galaxy.Travel;

import Calculations.Calculation;
import World.Galaxy.Star.Stars.Star;

/**
 * Created by jnebl on 5/12/2017.
 */
public class HyperSpaceLanes {
    private Star destination, origin;
    private double travelDistance;
    public HyperSpaceLanes(Star origin, Star destination){
        this.origin = origin; this.destination = destination;
        travelDistance = Calculation.starDistance(origin,destination);
//        System.out.println("hyperspace lane created from: \n"+origin+"\nto: "+destination);
    }

    public Star getDestination() {
        return destination;
    }
    public Star getOrigin() {
        return origin;
    }
    public double getTravelDistance() {
        return travelDistance;
    }
    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    @Override
    public String toString() {
        return "" + destination;
    }
}
