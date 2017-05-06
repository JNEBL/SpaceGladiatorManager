package Calculations;

/**
 * Created by student5 on 5/5/17.
 */
public class Value {
    private int value;
    private String purpose;
    public Value(int value,String purpose){
        this.value = value;
        this.purpose = purpose;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void incrementValue(int value){
        setValue(this.value + value);
    }

    public String getPurpose() {
        return purpose;
    }
}
