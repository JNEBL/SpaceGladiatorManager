package Calculations;

import World.Galaxy.Star.Stars.Star;

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
    public static Star closestStarToSentStar(Star star, int starIndexInUniverse, ArrayList<Star> stars){
        double closestStarDistance = starDistance(star,stars.get(0)) + 1;
        Star star1 = stars.get(0);
        if (starIndexInUniverse == 0){
            closestStarDistance = starDistance(star,stars.get(1)) + 1;
            star1 = stars.get(1);
        }
        for (int x = 0;x < stars.size();x++){
            if (closestStarDistance > starDistance(star,stars.get(x)) && x != starIndexInUniverse){
                closestStarDistance = starDistance(star,stars.get(x));
                star1 = stars.get(x);
            }
        }
        return star1;
    }
    public static double starDistance(Star starStart, Star starSecond){
        return Math.sqrt(Math.abs((Math.pow(starStart.getX() - starSecond.getX(),2)) +
                (Math.pow(starStart.getY() - starSecond.getY(),2)) +
                (Math.pow(starStart.getZ() - starSecond.getZ(),2))));
    }
    public static double starDistance(int x, int y, int z, Star star){
        return Math.sqrt(Math.abs((Math.pow(x - star.getX(),2)) +
                (Math.pow(y - star.getY(),2)) +
                (Math.pow(z - star.getZ(),2))));
    }
    public static Object Selector(Object[] objects){
        return objects[(int)(Math.random()*objects.length)];
    }
}
