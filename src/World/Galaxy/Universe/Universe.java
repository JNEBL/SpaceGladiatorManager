package World.Galaxy.Universe;

import Calculations.Calculation;
import World.Galaxy.Stars.Stars.Stars;
import World.Galaxy.Travel.HyperSpaceLanes;

import java.util.ArrayList;

/**
 * Created by student5 on 5/11/17.
 */
public class Universe {
    private ArrayList<Stars> stars = new ArrayList<>();
    private int galaxyAttempts = 1;
    public Universe(int numStars){
        addStars(numStars);
        setStarLocation(numStars);
        setGalacticHyperSpaceLanes(numStars);
        checkGalaxy(numStars);
    }

    private void setGalacticHyperSpaceLanes(int numStars){
        for (int x = 0;x < stars.size();x++){
            for (int y = 0;y < stars.size();y++){

                if (Calculation.starDistance(stars.get(x),stars.get(y)) < numStars * .1 && x != y){
                    stars.get(x).addHyperSpaceLane(new HyperSpaceLanes(stars.get(y)));
                }
            }
            if (Math.random() < .1){
                int starIndex = (int)(Math.random() * numStars);
                Stars chosen = stars.get(starIndex);
                boolean notSameStar = true;
                for (int z = 0;z < stars.get(x).getHyperSpaceLanes().size();z++){
                    if (stars.get(x).getHyperSpaceLanes().get(z).getDestination() == chosen)
                        notSameStar = false;
                }
                if (notSameStar) {
                    stars.get(x).addHyperSpaceLane(new HyperSpaceLanes(chosen));
                    stars.get(starIndex).addHyperSpaceLane(new HyperSpaceLanes(stars.get(x)));
                }
            }
            if (stars.get(x).getHyperSpaceLanes().size() == 0){
                stars.get(x).addHyperSpaceLane
                        (new HyperSpaceLanes(Calculation.closestStarToSentStar(stars.get(x),x,stars)));
                Calculation.closestStarToSentStar
                        (stars.get(x),x,stars).addHyperSpaceLane(new HyperSpaceLanes(stars.get(x)));
            }
        }
        for (int x = 0;x < stars.size();x++){
            stars.get(x).setHyperSpaceTravelDistance();
        }
    }
    private void setStarLocation(int numStars){
        for (int x = 0;x < stars.size();x++){
            stars.get(x).setLocation((int)(numStars * 40 * Math.random()),(int)(numStars * 40 * Math.random()),
                    (int)(numStars * 40 * Math.random()));
        }
    }
    private void checkGalaxy(int numStars){
        boolean restart = false;
        for (int x = 0;x < stars.size();x++){
            for (int y = 0;y < stars.size();y++){
                if ((stars.get(x).getX() == stars.get(y).getX()) && (x != y)){
                    if (stars.get(x).getY() == stars.get(y).getY()){
                        if (stars.get(x).getZ() == stars.get(y).getZ()){
                            restart = true;
                            x += stars.size();
                            y += stars.size();
                        }
                    }
                }
            }
        }
        if (!restart){
            checkGalacticHyperSpaceLanes(numStars);
        }
        else{
            galaxyAttempts ++;
            removeAllStars();
            setStarLocation(numStars);
            setGalacticHyperSpaceLanes(numStars);
            checkGalaxy(numStars);
        }
    }
    private void checkGalacticHyperSpaceLanes(int numStars){
        boolean restart = false;
        if (restart){
            galaxyAttempts ++;
            removeAllStars();
            setStarLocation(numStars);
            setGalacticHyperSpaceLanes(numStars);
            checkGalaxy(numStars);
        }
    }
    private void removeAllStars(){
        for (int x = stars.size() - 1;x >= 0;x--){
            stars.remove(x);
        }
    }

    private void addStars(int numStars){
        for (int x = 0;x < numStars;x++){
            stars.add(new Stars(numStars));
        }
    }
    public ArrayList<Stars> getStars() {
        return stars;
    }

    public int getNumberOfStars(){
        return stars.size();
    }
    public int getNumberOfPlanets(){
        int temp = 0;
        for (int x = 0;x < getNumberOfStars();x++){
            for (int y = 0;y < stars.get(x).getPlanets().size();y++){
                temp++;
            }
        }
        return temp;
    }
    public int getNumberOfMoons(){
        int temp = 0;
        for (int x = 0;x < getNumberOfStars();x++){
            for (int y = 0;y < stars.get(x).getPlanets().size();y++){
                for (int z = 0;z < stars.get(x).getPlanets().get(y).getMoons().size();z++){
                    temp++;
                }
            }
        }
        return temp;
    }
    public int getNumberOfSpaceStations(){
        int temp = 0;
        for (int x = 0;x < getNumberOfStars();x++){
            for (int y = 0;y < stars.get(x).getSpacePorts().size();y++){
                temp++;
            }
        }
        return temp;
    }
    public int getNumberOfHyperSpaceLanes(){
        int temp = 0;
        for (int x = 0;x < getStars().size();x++){
            for (int y = 0;y < getStars().get(x).getHyperSpaceLanes().size();y++){
                temp++;
            }
        }
        return temp;
    }

    public int getGalaxyAttempts() {
        return galaxyAttempts;
    }
}
