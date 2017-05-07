package World.Economics.DataBaseCurrencyGrabber;

import World.Economics.Base.MonetaryCurrency;
import World.Economics.CurrencyDataBase.GalacticCredits;

/**
 * Created by jnebl on 5/6/2017.
 */
public class CurrencyDataBase {
    public static MonetaryCurrency getGalacticCredits(int amount){
        return new GalacticCredits(amount);
    }
}
