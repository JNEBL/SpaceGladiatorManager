package Player.Ship.Ships.DataBaseGrabberShip;

import Player.Ship.Ships.Base.Ship;
import Player.Ship.Ships.ShipDataBase.A35VerdShip;

/**
 * Created by jnebl on 5/6/2017.
 */
public class ShipDataBase {
    public static Ship getA35VerdShip(){
        return new A35VerdShip();
    }
    public static Ship getA35VerdShip(String shipName){
        return new A35VerdShip();
    }
}
