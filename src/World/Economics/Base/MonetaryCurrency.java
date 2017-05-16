package World.Economics.Base;

/**
 * Created by jnebl on 5/6/2017.
 */
public class MonetaryCurrency {
    private double galacticStandardValue,amount;
    private String currencyName;
    public MonetaryCurrency(double amount, double galacticStandardValue, String currencyName){
        setAmount(amount);
        setGalacticStandardValue(galacticStandardValue);
        setCurrencyName(currencyName);
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
        if (this.amount <= 0)
            this.amount = 0;

    }
    public void incrementPositiveAmount(double amount){
        setAmount(this.amount + amount);
    }
    public void incrementNegativeAmount(double amount){
        setAmount(this.amount - amount);
    }


    public double getGalacticStandardValue() {
        return galacticStandardValue;
    }
    private void setGalacticStandardValue(double galacticStandardValue) {
        this.galacticStandardValue = galacticStandardValue;
    }

    public String getCurrencyName() {
        return currencyName;
    }
    private void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
}
