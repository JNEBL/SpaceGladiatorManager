package Player.Ship.Ships.Base;

import Player.Ship.Engine.Base.Engine;
import Player.Ship.Rooms.Base.Room;


/**
 * Created by jnebl on 5/6/2017.
 */
public class Ship {
    private Room[] largeRooms;
    private Room[] mediumRooms;
    private Room[] smallRooms;
    private Engine engine;
    public Ship(int largeRooms,int mediumRooms,int smallRooms,Engine engine){
        this.largeRooms = new Room[largeRooms];
        this.mediumRooms = new Room[mediumRooms];
        this.smallRooms = new Room[smallRooms];
        this.engine = engine;
    }

    public Room[] getLargeRooms() {
        return largeRooms;
    }

    public Room[] getMediumRooms() {
        return mediumRooms;
    }

    public Room[] getSmallRooms() {
        return smallRooms;
    }

    public Engine getEngine() {
        return engine;
    }
}
