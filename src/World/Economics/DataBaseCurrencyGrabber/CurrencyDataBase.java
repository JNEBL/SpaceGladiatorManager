package World.Economics.DataBaseCurrencyGrabber;

import World.Economics.Base.Currency;
import World.Economics.CurrencyDataBase.GalacticCredits;

/**
 * Created by jnebl on 5/6/2017.
 */
public class CurrencyDataBase {
    public static Currency getGalacticCredits(int amount){
        return new GalacticCredits(amount);
    }
}
