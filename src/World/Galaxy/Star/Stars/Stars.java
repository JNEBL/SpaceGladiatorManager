package World.Galaxy.Star.Stars;

import Calculations.Calculation;
import World.Galaxy.Star.Planets.Planets.Planet;
import World.Galaxy.Star.SpacePort.SpacePort;
import World.Galaxy.Travel.HyperSpaceLanes;

import java.util.ArrayList;

/**
 * Created by student5 on 5/11/17.
 */
public class Stars {
    private ArrayList<Planet> planets = new ArrayList<>();
    private ArrayList<SpacePort> spacePorts = new ArrayList<>();
    private ArrayList<HyperSpaceLanes> hyperSpaceLanes = new ArrayList<>();
    private int x = 0,y = 0,z = 0;
    public static final int minRange = 500, maxRange = 2000;
    private int[] location = new int[3];
    public Stars(ArrayList<Stars> starsAlreadyGenerated){
        //start location generation!
        generateNewLocation(starsAlreadyGenerated);
        boolean inBounds = false;
        while (!inBounds){
            boolean inBoundsSingle = false;
            if(starsAlreadyGenerated.size() != 0) {
                for (int scan = 0; scan < starsAlreadyGenerated.size(); scan++) {
                    boolean inX, inY, inZ;
                    inX = Math.abs(starsAlreadyGenerated.get(scan).x - x) <= 500;
                    inY = Math.abs(starsAlreadyGenerated.get(scan).y - y) <= 500;
                    inZ = Math.abs(starsAlreadyGenerated.get(scan).z - z) <= 500;
                    if (inX || inY || inZ) inBoundsSingle = true;

                }
                if (!inBoundsSingle) generateNewLocation(starsAlreadyGenerated);
            }else
                generateNewLocation(starsAlreadyGenerated);
            inBounds = true;
        }
        //end location generation!
        //start planet generation!
        int planets = (int)(Math.random()*11);
        for(int scan = 0; scan < planets; scan++){
            this.planets.add(new Planet());
        }
        //end planet generation!
    }

    private void generateNewLocation(ArrayList<Stars> starsAlreadyGenerated){
//        System.out.println("new location needed for "+x+" , "+y+" , "+z);
//        System.out.println("stars present = "+ starsAlreadyGenerated.size());
        if(starsAlreadyGenerated.size()!=0) {
            int temp = (int) (Math.random() * starsAlreadyGenerated.size());
            //this next part needs to be fixed. if x y and z are ++500'ed they are out of range. neble help
            if (Math.random() > .5)
                x = (int) (starsAlreadyGenerated.get(temp).x + minRange + (Math.random() * maxRange - minRange));
            else x = (int) (starsAlreadyGenerated.get(temp).x - minRange - (Math.random() * maxRange - minRange));

            if (Math.random() > .5)
                y = (int) (starsAlreadyGenerated.get(temp).y + minRange + (Math.random() * maxRange - minRange));
            else y = (int) (starsAlreadyGenerated.get(temp).y - minRange - (Math.random() * maxRange - minRange));

            if (Math.random() > .5)
                z = (int) (starsAlreadyGenerated.get(temp).z + minRange + (Math.random() * maxRange - minRange));
            else z = (int) (starsAlreadyGenerated.get(temp).z - minRange - (Math.random() * maxRange - minRange));
        }
        else{
            x = 0;y = 0; z = 0;}
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
        this.hyperSpaceLanes.add(hyperSpaceLanes);
    }
    public void setHyperSpaceTravelDistance(){
        for (int x = 0;x < hyperSpaceLanes.size();x++){
            hyperSpaceLanes.get(x).setTravelDistance((int)(Calculation.starDistance
                    (this,hyperSpaceLanes.get(x).getDestination())));
        }
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
