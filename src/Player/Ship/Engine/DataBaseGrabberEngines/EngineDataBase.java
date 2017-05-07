package Player.Ship.Engine.DataBaseGrabberEngines;

import Player.Ship.Engine.Base.Engine;
import Player.Ship.Engine.EngineDataBase.GalacticStandardHyperDrive;

/**
 * Created by jnebl on 5/6/2017.
 */
public class EngineDataBase {
    public static Engine getGalacticStandardHyperDrive(){
        return new GalacticStandardHyperDrive();
    }
}
