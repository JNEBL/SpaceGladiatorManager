package Calculations;

import java.util.ArrayList;

/**
 * Created by student5 on 5/5/17.
 */
public class Calculation {
    public static boolean valueChecker(Value value,String purpose){
        if (value.getPurpose().equalsIgnoreCase(purpose))
            return true;
        else
            return false;
    }
    public static boolean valueChecker(Value value,int val){
        if (value.getValue() == val)
            return true;
        else
            return false;
    }
    public static boolean valueCheckerArrayList(ArrayList<Value> arrayList,String purpose){
        for (int x = 0;x < arrayList.size();x++){
            if (valueChecker(arrayList.get(x),purpose))
                return true;
        }
        return false;
    }
}
