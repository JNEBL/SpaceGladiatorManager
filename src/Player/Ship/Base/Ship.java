package Player.Ship.Base;


import java.util.ArrayList;


/**
 * Created by jnebl on 5/6/2017.
 */
public class Ship {
    private String shipType,shipName;
    private int maxGladiators,stealth,speed;

    public Ship(int maxGladiators,int stealth,int speed,String shipType){
        this(maxGladiators,stealth,speed,shipType,"Generic Ship");
    }
    public Ship(int maxGladiators,int stealth,int speed,String shipType,String shipName){
        this.maxGladiators = maxGladiators;
        this.stealth = stealth;
        this.speed = speed;
        this.shipType = shipType;
        this.shipName = shipName;
    }

    public int getMaxGladiators() {
        return maxGladiators;
    }
    private void setMaxGladiators(int maxGladiators) {
        this.maxGladiators = maxGladiators;
    }

    public int getSpeed() {
        return speed;
    }
    private void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public int getStealth() {
        return stealth;
    }
    private void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getShipName() {
        return shipName;
    }
    private void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipType() {
        return shipType;
    }
    private void setStealth(int stealth) {
        this.stealth = stealth;
    }
}
