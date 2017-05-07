package Player.Ship.Rooms.DataBaseGrabberRooms;

import Player.Ship.Rooms.Base.Room;
import Player.Ship.Rooms.RoomDataBase.LargeRoom.EmptyLargeRoom;
import Player.Ship.Rooms.RoomDataBase.MediumRoom.EmptyMediumRoom;
import Player.Ship.Rooms.RoomDataBase.SmallRoom.EmptySmallRoom;

/**
 * Created by jnebl on 5/6/2017.
 */
public class RoomDataBase {
    public static Room getEmptyLargeRoom(){
        return new EmptyLargeRoom();
    }
    public static Room getEmptyMediumRoom(){
        return new EmptyMediumRoom();
    }
    public static Room getEmptySmallRoom(){
        return new EmptySmallRoom();
    }

}
