package Calculations;

import World.Galaxy.Star.Stars.Stars;

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
    public static int arrayListGladiatorValueIndexFinder(ArrayList<Value> arrayList,String purpose){
        for (int x = 0;x < arrayList.size();x++){
            if (Calculation.valueChecker(arrayList.get(x),purpose))
                return x;
        }
        return -1;
    }
    public static Stars closestStarToSentStar(Stars star,int starIndexInUniverse,ArrayList<Stars> stars){
        double closestStarDistance = starDistance(star,stars.get(0)) + 1;
        Stars stars1 = stars.get(0);
        if (starIndexInUniverse == 0){
            closestStarDistance = starDistance(star,stars.get(1)) + 1;
            stars1 = stars.get(1);
        }
        for (int x = 0;x < stars.size();x++){
            if (closestStarDistance > starDistance(star,stars.get(x)) && x != starIndexInUniverse){
                closestStarDistance = starDistance(star,stars.get(x));
                stars1 = stars.get(x);
            }
        }
        return stars1;
    }
    public static double starDistance(Stars starsStart,Stars starsSecond){
        return Math.sqrt(Math.abs((Math.pow(starsStart.getX() - starsSecond.getX(),2)) +
                (Math.pow(starsStart.getY() - starsSecond.getY(),2)) +
                (Math.pow(starsStart.getZ() - starsSecond.getZ(),2))));
    }
}
