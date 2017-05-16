package Calculations;

import World.Economics.Base.MonetaryCurrency;

/**
 * Created by student5 on 5/16/17.
 */
public class CurrencyMath {
    public static MonetaryCurrency currencyConversion(MonetaryCurrency firstCurrency,MonetaryCurrency convertedCurrency){
        double firstEquation = 1 / firstCurrency.getGalacticStandardValue();
        return convertedCurrency.getGalacticStandardValue() / firstEquation;
    }
}
