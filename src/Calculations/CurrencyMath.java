package Calculations;

import World.Economics.Base.MonetaryCurrency;

/**
 * Created by student5 on 5/16/17.
 */
public class CurrencyMath {
    public static MonetaryCurrency currencyConversion(MonetaryCurrency firstCurrency,MonetaryCurrency convertedCurrency){
        double ratio = convertedCurrency.getGalacticStandardValue() / firstCurrency.getGalacticStandardValue();
        convertedCurrency.setAmount(ratio * firstCurrency.getAmount());
        return convertedCurrency;
    }
}
