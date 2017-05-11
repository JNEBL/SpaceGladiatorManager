package World.Galaxy.Universe;

import World.Galaxy.Stars.Stars.Stars;

import java.util.ArrayList;

/**
 * Created by student5 on 5/11/17.
 */
public class Universe {
    private ArrayList<Stars> stars = new ArrayList<>();
    public Universe(int numStars){
        for (int x = 0;x < numStars;x++){
            stars.add(new Stars());
        }
    }

    public ArrayList<Stars> getStars() {
        return stars;
    }
}
