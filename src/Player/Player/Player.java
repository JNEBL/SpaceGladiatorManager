package Player.Player;

        import Fighters.Gladiator.Base.Gladiator;
        import Player.Ship.Base.Ship;
        import Player.Ship.DataBaseGrabberShip.ShipDataBase;
        import World.Economics.Base.MonetaryCurrency;
        import World.Economics.DataBaseCurrencyGrabber.CurrencyDataBase;
        import World.Language.Base.Language;
        import World.Tournament.Team;

        import java.util.ArrayList;

/**
 * Created by jnebl on 5/6/2017.
 */
public class Player {
    private ArrayList<MonetaryCurrency> currencies = new ArrayList<>();
    private Team team;
    private ArrayList<Language> languages = new ArrayList<>();
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


    public ArrayList<Language> getLanguages() {
        return languages;
    }
}
