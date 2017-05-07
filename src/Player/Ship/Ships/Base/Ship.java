package Player.Ship.Ships.Base;

import Player.Ship.Engine.Base.Engine;
import Player.Ship.Rooms.Base.Room;
import Player.Ship.Rooms.DataBaseGrabberRooms.RoomDataBase;


/**
 * Created by jnebl on 5/6/2017.
 */
public class Ship {
    private Room[] largeRooms;
    private Room[] mediumRooms;
    private Room[] smallRooms;
    private Engine engine;
    private String shipClass,shipName;
    public Ship(int largeRooms,int mediumRooms,int smallRooms,Engine engine,String shipClass){
        this.largeRooms = new Room[largeRooms];
        this.mediumRooms = new Room[mediumRooms];
        this.smallRooms = new Room[smallRooms];
        this.engine = engine;
        this.shipClass = shipClass;
        setShipName("Generic Ship");
        for (int x = 0;x < this.largeRooms.length;x++){
            this.largeRooms[x] = RoomDataBase.getEmptyLargeRoom();
        }
        for (int x = 0;x < this.mediumRooms.length;x++){
            this.mediumRooms[x] = RoomDataBase.getEmptyMediumRoom();
        }
        for (int x = 0;x < this.smallRooms.length;x++){
            this.smallRooms[x] = RoomDataBase.getEmptySmallRoom();
        }
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

    public String getShipClass() {
        return shipClass;
    }

    public String getShipName() {
        return shipName;
    }
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
}
