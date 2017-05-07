package Player.Player;

import Fighters.Base.Gladiator;
import Player.Ship.Ships.Base.Ship;
import Player.Ship.Ships.DataBaseGrabberShip.ShipDataBase;
import World.Economics.Base.MonetaryCurrency;
import World.Economics.DataBaseCurrencyGrabber.CurrencyDataBase;

import java.util.ArrayList;

/**
 * Created by jnebl on 5/6/2017.
 */
public class Player {
    ArrayList<MonetaryCurrency> currencies = new ArrayList<>();
    ArrayList<Gladiator> gladiators = new ArrayList<>();
    private Ship ship;
    public Player(){
        this.ship = ShipDataBase.getA35VerdShip();
        currencies.add(CurrencyDataBase.getGalacticCredits(10000));
    }

    public Ship getShip() {
        return ship;
    }

    public ArrayList<MonetaryCurrency> getCurrencies() {
        return currencies;
    }

    public ArrayList<Gladiator> getGladiators() {
        return gladiators;
    }
    public void addGladiator(Gladiator gladiator){
        gladiators.add(gladiator);
    }
    public void removeGladiator(int index){
        gladiators.remove(index);
    }
}
