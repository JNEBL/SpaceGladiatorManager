package World.Economics.Base;

/**
 * Created by jnebl on 5/6/2017.
 */
public class MonetaryCurrency {
    private int amount,galacticStandardValue;
    private String currencyName;
    public MonetaryCurrency(int amount, int galacticStandardValue, String currencyName){
        setAmount(amount);
        setGalacticStandardValue(galacticStandardValue);
        setCurrencyName(currencyName);
    }

    public int getAmount() {
        return amount;
    }
    private void setAmount(int amount) {
        this.amount = amount;
    }
    public void incrementPoitiveAmount(int amount){
        setAmount(this.amount + amount);
    }
    public void incrementNegativeAmount(int amount){
        setAmount(this.amount - amount);
    }


    public int getGalacticStandardValue() {
        return galacticStandardValue;
    }
    private void setGalacticStandardValue(int galacticStandardValue) {
        this.galacticStandardValue = galacticStandardValue;
    }

    public String getCurrencyName() {
        return currencyName;
    }
    private void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
}
