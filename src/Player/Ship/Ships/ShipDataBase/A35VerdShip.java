package Player.Ship.Ships.ShipDataBase;

import Player.Ship.Engine.DataBaseGrabberEngines.EngineDataBase;
import Player.Ship.Ships.Base.Ship;

/**
 * Created by jnebl on 5/6/2017.
 */
public class A35VerdShip extends Ship{
    public A35VerdShip(){
        super(1,4,1, EngineDataBase.getGalacticStandardHyperDrive(),
                "A-35 Verd Ship");
    }
}
