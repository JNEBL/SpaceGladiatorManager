package World.Galaxy.Stars.Stars;

import World.Galaxy.Stars.Planets.Planets.Planet;
import World.Galaxy.Stars.SpacePort.SpacePort;
import World.Galaxy.Travel.HyperSpaceLanes;

import java.util.ArrayList;

/**
 * Created by student5 on 5/11/17.
 */
public class Stars {
    private ArrayList<Planet> planets = new ArrayList<>();
    private ArrayList<SpacePort> spacePorts = new ArrayList<>();
    private ArrayList<HyperSpaceLanes> hyperSpaceLanes = new ArrayList<>();
    private int x,y,z;
    private int[] location = new int[3];
    public Stars(int numStars){
        for (int x = 0;x < (int)(Math.random() * 3);x++){
            spacePorts.add(new SpacePort());
        }
        for (int x = 0;x < (int)(Math.random() * 13);x++){
            planets.add(new Planet());
        }
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public ArrayList<SpacePort> getSpacePorts() {
        return spacePorts;
    }

    public ArrayList<HyperSpaceLanes> getHyperSpaceLanes() {
        return hyperSpaceLanes;
    }
    public void addHyperSpaceLane(HyperSpaceLanes hyperSpaceLanes){

    }

    public int getX() {
        return x;
    }
    private void setX(int x) {
        this.x = x;
        this.location[0] = x;
    }

    public int getY() {
        return y;
    }
    private void setY(int y) {
        this.y = y;
        this.location[1] = y;
    }

    public int getZ() {
        return z;
    }
    private void setZ(int z) {
        this.z = z;
        this.location[2] = z;
    }

    public void setLocation(int x,int y,int z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public int[] getLocation() {
        return location;
    }
}
