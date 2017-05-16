package Player.Player;

        import Fighters.Gladiator.Base.Gladiator;
        import Player.Ship.Base.Ship;
        import Player.Ship.DataBaseGrabberShip.ShipDataBase;
        import World.Economics.Base.MonetaryCurrency;
        import World.Economics.DataBaseCurrencyGrabber.CurrencyDataBase;

        import java.util.ArrayList;

/**
 * Created by jnebl on 5/6/2017.
 */
public class Player {
    private ArrayList<MonetaryCurrency> currencies = new ArrayList<>();
    private ArrayList<Gladiator> gladiators = new ArrayList<>();
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
        if (ship.getMaxGladiators() > gladiators.size())
            gladiators.add(gladiator);
    }
    public void removeGladiator(int index){
        if (index > -1)
            gladiators.remove(index);
    }
}
