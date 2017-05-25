package World.Galaxy.Universe;

import World.Galaxy.Star.Stars.Star;

import java.util.ArrayList;

/**
 * Created by citim on 5/25/2017.
 */
public class UniverseTypeDatabase {
    public static ArrayList<Star> getTemplate(String templateName, int numStars){

        if(templateName.equals("spiral")) return spiral(numStars);
        return centralMass();
    }

    private static ArrayList<Star> centralMass(){
        ArrayList<Star> stars = new ArrayList<>();
        stars.add(new Star(0,0,0));
        return stars;
    }
    private static ArrayList<Star> spiral(int numStars){
        ArrayList<Star> stars = new ArrayList<>();
        stars.add(new Star(0,0,0));
        int quadrantSize = numStars*2; //half of the map should be as long as twice the number of stars
        for(int quadrant = 1; quadrant <= 4; quadrant++){
            int xMult = 1, yMult = 1;
            if(quadrant == 2 || quadrant == 3 )xMult = -1;
            if(quadrant == 3 || quadrant == 4 )yMult = -1;
            stars.add(new Star(quadrantSize*xMult,quadrantSize/2*yMult,0));
            stars.add(new Star(quadrantSize/2*xMult,quadrantSize*yMult,0));
            stars.add(new Star(quadrantSize/5*xMult,quadrantSize/2*yMult,0));
            stars.add(new Star(quadrantSize/4*xMult,quadrantSize*3/4*yMult,0));
            stars.add(new Star(quadrantSize/4*3*xMult,quadrantSize*3/4*yMult,0));

        }
        return stars;

    }
}
