package World.Galaxy.Universe;

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
                if (((stars.get(x).getX() - ((int) (numStars * .02))) <= (stars.get(y).getX())) &&
                        ((stars.get(x).getX() + ((int) (numStars * .02))) >= (stars.get(y).getX()))){
                    if (((stars.get(x).getY()- ((int) (numStars * .02))) <= (stars.get(y).getY())) &&
                            ((stars.get(x).getY()+ ((int) (numStars * .02))) >= (stars.get(y).getY()))){
                        if (((stars.get(x).getZ()- ((int) (numStars * .02))) <= (stars.get(y).getZ())) &&
                                ((stars.get(x).getZ()+ ((int) (numStars * .02))) >= (stars.get(y).getZ()))){
                            if (x != y)
                                stars.get(x).addHyperSpaceLane(new HyperSpaceLanes(stars.get(y)));
                        }
                    }
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
                temp+=1;
            }
        }
        return temp;
    }
    public int getNumberOfMoons(){
        int temp = 0;
        for (int x = 0;x < getNumberOfStars();x++){
            for (int y = 0;y < stars.get(x).getPlanets().size();y++){
                for (int z = 0;z < stars.get(x).getPlanets().get(y).getMoons().size();z++){
                    temp+=1;
                }
            }
        }
        return temp;
    }
    public int getNumberOfSpaceStations(){
        int temp = 0;
        for (int x = 0;x < getNumberOfStars();x++){
            for (int y = 0;y < stars.get(x).getSpacePorts().size();y++){
                temp+=1;
            }
        }
        return temp;
    }

    public int getGalaxyAttempts() {
        return galaxyAttempts;
    }
}
