package World.Galaxy.Star.Stars;

import Calculations.Calculation;
import World.Galaxy.Star.Planets.Planets.Planet;
import World.Galaxy.Star.SpacePort.SpaceStation;
import World.Galaxy.Travel.HyperSpaceLanes;
import sun.plugin2.util.ColorUtil;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.util.ArrayList;

public class Star {
    private ArrayList<Planet> planets = new ArrayList<>();
    private ArrayList<SpaceStation> spaceStations = new ArrayList<>();
    private ArrayList<HyperSpaceLanes> hyperSpaceLanes = new ArrayList<>();
    private int x = 0,y = 0,z = 0, lums;
    private double security;
    public Color color;
    public static final int minRange = 500, maxRange = 3000;
    private int[] location = new int[3];
    public Star(ArrayList<Star> starAlreadyGenerated){
        //start location generation!
        generateNewLocation(starAlreadyGenerated);
        boolean inBounds = false;
        while (!inBounds){
            boolean inBoundsSingle = false;
            if(starAlreadyGenerated.size() != 0) {
                for (int scan = 0; scan < starAlreadyGenerated.size(); scan++) {
                    boolean inX, inY, inZ;
                    inX = Math.abs(starAlreadyGenerated.get(scan).x - x) <= 500;
                    inY = Math.abs(starAlreadyGenerated.get(scan).y - y) <= 500;
                    inZ = Math.abs(starAlreadyGenerated.get(scan).z - z) <= 500;
                    if (inX || inY || inZ) inBoundsSingle = true;

                }
                if (!inBoundsSingle) generateNewLocation(starAlreadyGenerated);
            }else
                generateNewLocation(starAlreadyGenerated);
            inBounds = true;
        }
        security = Math.random() * 1;
        //end location generation!
        color = (Color) Calculation.Selector(new Object[]{Color.red, Color.orange, Color.yellow, Color.white, Color.CYAN});
        if(color == Color.CYAN)
        if(Math.random()<.05) spaceStations.add(new SpaceStation(this));
        //start planet generation!
        int planets = (int)(Math.random()*11);
        for(int scan = 0; scan < planets; scan++){
            this.planets.add(new Planet(this));
        }
        //end planet generation!
    }
    public Star(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

        color = (Color) Calculation.Selector(new Object[]{Color.red, Color.orange, Color.yellow, Color.white, Color.CYAN});
        if (Math.random() < .05) spaceStations.add(new SpaceStation(this));
        //start planet generation!
        int planets = (int) (Math.random() * 11);
        for (int scan = 0; scan < planets; scan++) {
            this.planets.add(new Planet(this));
        }
    }

    public boolean hasWormHole(){
        for(int scan = 0; scan < spaceStations.size(); scan++){
            if(spaceStations.get(scan).wormHole != null) return true;
        }
        return false;
    }
    private void generateNewLocation(ArrayList<Star> starAlreadyGenerated){
//        System.out.println("new location needed for "+x+" , "+y+" , "+z);
//        System.out.println("stars present = "+ starAlreadyGenerated.size());
        if(starAlreadyGenerated.size()!=0) {
            int temp = (int) (Math.random() * starAlreadyGenerated.size());
            //this next part needs to be fixed. if x y and z are ++500'ed they are out of range. neble help
            if (Math.random() > .5)
                x = (int) (starAlreadyGenerated.get(temp).x + minRange + (Math.random() * maxRange - minRange));
            else x = (int) (starAlreadyGenerated.get(temp).x - minRange - (Math.random() * maxRange - minRange));

            if (Math.random() > .5)
                y = (int) (starAlreadyGenerated.get(temp).y + minRange + (Math.random() * maxRange - minRange));
            else y = (int) (starAlreadyGenerated.get(temp).y - minRange - (Math.random() * maxRange - minRange));

            if (Math.random() > .5)
                z = (int) (starAlreadyGenerated.get(temp).z + minRange + (Math.random() * maxRange - minRange));
            else z = (int) (starAlreadyGenerated.get(temp).z - minRange - (Math.random() * maxRange - minRange));
        }
        else{
            x = 0;y = 0; z = 0;}
    }
    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public ArrayList<SpaceStation> getSpaceStation() {
        return spaceStations;
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

    public double getSecurity() {
        return security;
    }
}
