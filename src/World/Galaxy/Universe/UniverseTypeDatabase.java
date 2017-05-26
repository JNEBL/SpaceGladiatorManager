package World.Galaxy.Universe;

import World.Galaxy.Star.Stars.Star;

import java.util.ArrayList;

/**
 * Created by citim on 5/25/2017.
 */
public class UniverseTypeDatabase {
    public static ArrayList<Star> getTemplate(String templateName, int numStars){

        if(templateName.equals("spiral")) return spiral(numStars);
        if(templateName.equals("central mass")) return centralMass();
        if(templateName.equals("bridge")) return bridge(numStars);
        System.out.println("error: getTemplate sent invalid universe! ("+templateName+")");

        return centralMass();
    }

    private static ArrayList<Star> centralMass(){
        ArrayList<Star> stars = new ArrayList<>();
        stars.add(new Star(0,0,0));
        return stars;
    }
    private static ArrayList<Star> bridge(int numStars){
        ArrayList<Star> stars = new ArrayList<>();
        stars.add(new Star(0,0,0));
        int quadrantSize = numStars*3;
        stars.add(new Star(quadrantSize*3/4,0,0));
        stars.add(new Star(quadrantSize*3/4,Star.minRange,0));
        stars.add(new Star(quadrantSize*3/4,-Star.minRange,0));
        stars.add(new Star(quadrantSize*3/4+Star.minRange,0,0));
        stars.add(new Star(quadrantSize,0,0));
        stars.add(new Star(quadrantSize/2,0,0));
        stars.add(new Star(quadrantSize/8,0,0));
        stars.add(new Star(quadrantSize/4,0,0));

        stars.add(new Star(-quadrantSize*3/4,0,0));
        stars.add(new Star(-quadrantSize*3/4,Star.minRange,0));
        stars.add(new Star(-quadrantSize*3/4,-Star.minRange,0));
        stars.add(new Star(-quadrantSize*3/4+Star.minRange,0,0));
        stars.add(new Star(-quadrantSize,0,0));
        stars.add(new Star(-quadrantSize/2,0,0));
        stars.add(new Star(-quadrantSize/8,0,0));
        stars.add(new Star(-quadrantSize/4,0,0));

        return stars;
    }
    private static ArrayList<Star> spiral(int numStars){
        ArrayList<Star> stars = new ArrayList<>();
        stars.add(new Star(0,0,0));
        int quadrantSize = numStars*2; //half of the map should be as long as twice the number of stars
            int xMult = 1, yMult = 1;
            stars.add(new Star(quadrantSize/8*xMult,quadrantSize/8*yMult,0));
                stars.add(new Star(quadrantSize * xMult, quadrantSize*7/8 * yMult, 0));
                stars.add(new Star(quadrantSize / 2 * xMult, quadrantSize*3/4 * yMult, 0));
                stars.add(new Star(quadrantSize / 5 * xMult, quadrantSize / 2 * yMult, 0));
                stars.add(new Star(quadrantSize / 4 * xMult, quadrantSize * 3 / 4 * yMult, 0));
//                stars.add(new Star(quadrantSize / 4 * 3 * xMult, quadrantSize * 3 / 4 * yMult, 0));
            xMult = -1;
            yMult = -1;
        stars.add(new Star(quadrantSize/8*xMult,quadrantSize/8*yMult,0));
        stars.add(new Star(quadrantSize * xMult, quadrantSize*7/8 * yMult, 0));
            stars.add(new Star(quadrantSize / 2 * xMult, quadrantSize*3/4  * yMult, 0));
            stars.add(new Star(quadrantSize / 5 * xMult, quadrantSize / 2 * yMult, 0));
            stars.add(new Star(quadrantSize / 4 * xMult, quadrantSize * 3 / 4 * yMult, 0));
//            stars.add(new Star(quadrantSize / 4 * 3 * xMult, quadrantSize * 3 / 4 * yMult, 0));
            int initialStarSize = stars.size();
            for(int scan = 0; scan < initialStarSize-1; scan++){
                Star temp = stars.get(scan);
                stars.add(new Star(temp.getY()*-1,temp.getX(),0));
            }

        return stars;

    }
}
