package World.Galaxy.Stars.Stars;

import World.Galaxy.Stars.Planets.Planets.Planet;
import World.Galaxy.Stars.SpacePort.SpacePort;

import java.util.ArrayList;

/**
 * Created by student5 on 5/11/17.
 */
public class Stars {
    private ArrayList<Planet> planets = new ArrayList<>();
    private ArrayList<SpacePort> spacePorts = new ArrayList<>();
    public Stars(){
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
}
