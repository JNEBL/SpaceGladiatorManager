package Player.Ship.Engine.Base;

/**
 * Created by jnebl on 5/6/2017.
 */
public class Engine {
    private int fuelLimit,distancePerJump;
    String name;
    public Engine(int fuelLimit,int distancePerJump,String name){
        this.distancePerJump = distancePerJump;
        this.fuelLimit = fuelLimit;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDistancePerJump() {
        return distancePerJump;
    }
    public void setDistancePerJump(int distancePerJump) {
        this.distancePerJump = distancePerJump;
    }

    public int getFuelLimit() {
        return fuelLimit;
    }
    public void setFuelLimit(int fuelLimit) {
        this.fuelLimit = fuelLimit;
    }
}
