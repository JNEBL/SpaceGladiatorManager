package GameFrameWork;

import Calculations.Calculation;
import Calculations.Unigen;
import GameFrameWork.Buttons.Button;
import GameFrameWork.Buttons.ButtonNudge;
import GameFrameWork.Buttons.ButtonNudgeDouble;
import World.Galaxy.Star.Stars.Star;
import World.Galaxy.Universe.Universe;

import java.awt.*;
import java.util.ArrayList;

public class PanelUniverseDisplay extends Panel {
    private String side = "front";
    private double megamileToPixelRatio;
    public int xCameraPosition = 0, yCameraPosition = 0, zCameraPosition = 0;
    public double zoomPercent = 100;
    public PanelUniverseDisplay(int x, int y, int xDimension, int yDimension,Menus.Menu menu, double megamileToPixelRatio){
        super(x,y,xDimension,yDimension,menu);
        buttons.add(new Button(x,y+yDimension-yDimension/8,xDimension/3,yDimension/8,"front"));
        buttons.add(new Button(x+xDimension/3,y+yDimension-yDimension/8,xDimension/3,
                yDimension/8,"side"));
        buttons.add(new Button(x+2*(xDimension/3),y+yDimension-yDimension/8,
                xDimension/3,yDimension/8,"top"));
        buttons.add(new ButtonNudgeDouble(x,y+yDimension-yDimension/8-yDimension/8,xDimension/4,yDimension/8,"zoom percent ",0,500,50,5,25));
        this.megamileToPixelRatio = megamileToPixelRatio*2;
    }
    public void questionPressed() { //this is a template. an if scan== x is needed per button
        for (int scan = 1; scan < buttons.size(); scan++) {
            if (buttons.get(scan).clicked) {
                if (scan == 1) {
                    side = "front";
                    display();

                    break;
                }
                if (scan == 2) {
                    side = "side";
                    display();

                    break;
                }if (scan == 3) {
                    side = "top";
                    display();

                    break;
                }
                if (scan == 4) {
                    ButtonNudge nudge = (ButtonNudge) buttons.get(4);
                    zoomPercent = nudge.getCurrent();
                    display();
                    break;
                }

            }
        }
    }
    private boolean inBounds(int x, int y){
        return x >= this.x && x <= xDimension && y >= this.y && y <= yDimension;
    }
    private boolean inView(Star star){
        int distanceViewed = (int)(250*zoomPercent/2); //is the radius of the sphere of your view
        return Calculation.starDistance(xCameraPosition,yCameraPosition,zCameraPosition,star)<= distanceViewed;
    }
    public void displayComponent(){
        ArrayList<Star> viewableStars = new ArrayList<>();
        for(int scan = 0; scan <  Unigen.universe.getStars().size(); scan++){
            Star current = Unigen.universe.getStars().get(scan);
            if(inView(current))
                viewableStars.add(current);
        }
        int[] dimensions = Calculation.findDimensions(viewableStars);
        megamileToPixelRatio = dimensions[0]/Window.window.y;
        if(dimensions[1]/Window.window.y < megamileToPixelRatio)megamileToPixelRatio = dimensions[0]/Window.window.y;
        if(dimensions[2]/Window.window.y < megamileToPixelRatio)megamileToPixelRatio = dimensions[2]/Window.window.y;


        Graphics g = Window.window.getGraphics();
        if(side.equals("front")){
            for(int scan = 0; scan < viewableStars.size(); scan++){
                if(!inBounds((int)(viewableStars.get(scan).getX()/megamileToPixelRatio+xDimension/2),(int)(viewableStars.get(scan).getY() /megamileToPixelRatio+yDimension/3*2))) {
                    viewableStars.remove(scan);
                    scan--;
                }
            }
            for(int scan = 0; viewableStars.size() > scan; scan++){
                    g.setColor(viewableStars.get(scan).color);
                    if (viewableStars.get(scan).getSpaceStation().size() != 0)
                        g.drawOval((int) (viewableStars.get(scan).getX()
                                / megamileToPixelRatio + xDimension / 2), (int) (viewableStars.get(scan).getY()
                                / megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    if (viewableStars.get(scan).hasWormHole())
                        g.fillOval((int) (viewableStars.get(scan).getX() / megamileToPixelRatio + xDimension / 2),
                                (int) (viewableStars.get(scan).getY() / megamileToPixelRatio + yDimension / 3 * 2),
                                7, 7);
                    g.fillRect((int) (viewableStars.get(scan).getX() / megamileToPixelRatio + xDimension / 2),
                            (int) (viewableStars.get(scan).getY() / megamileToPixelRatio + yDimension / 3 * 2),
                            2, 2);

            }
        }
        if(side.equals("side")){
            for(int scan = 0; scan < viewableStars.size(); scan++){
                if(!inBounds((int)(viewableStars.get(scan).getZ()/megamileToPixelRatio+xDimension/2),(int)(viewableStars.get(scan).getY() /megamileToPixelRatio+yDimension/3*2))) {
                    viewableStars.remove(scan);
                    scan--;
                }
            }
            for(int scan = 0; viewableStars.size() > scan; scan++) {

                    g.setColor(viewableStars.get(scan).color);
                    if (viewableStars.get(scan).getSpaceStation().size() != 0)
                        g.drawOval((int) (viewableStars.get(scan).getZ() /
                                megamileToPixelRatio + xDimension / 2), (int) (viewableStars.get(scan).getY() /
                                megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    if (viewableStars.get(scan).hasWormHole())
                        g.fillOval((int) (viewableStars.get(scan).getZ() /
                                megamileToPixelRatio + xDimension / 2), (int) (viewableStars.get(scan).getY() /
                                megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    g.fillRect((int) (viewableStars.get(scan).getZ() /
                            megamileToPixelRatio + xDimension / 2), (int) (viewableStars.get(scan).getY() /
                            megamileToPixelRatio + yDimension / 3 * 2), 2, 2);
                }
            }

        if(side.equals("top")){
            for(int scan = 0; scan < viewableStars.size(); scan++){
                if(!inBounds((int)(viewableStars.get(scan).getX()/megamileToPixelRatio+xDimension/2),(int)(viewableStars.get(scan).getZ() /megamileToPixelRatio+yDimension/3*2))) {
                    viewableStars.remove(scan);
                    scan--;
                }
            }
            for(int scan = 0; viewableStars.size() > scan; scan++) {

                    g.setColor(viewableStars.get(scan).color);
                    if (viewableStars.get(scan).getSpaceStation().size() != 0)
                        g.drawOval((int) (viewableStars.get(scan).getX() /
                                megamileToPixelRatio + xDimension / 2), (int) (viewableStars.get(scan).getZ() /
                                megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    if (viewableStars.get(scan).hasWormHole())
                        g.fillOval((int) (viewableStars.get(scan).getX() /
                                megamileToPixelRatio + xDimension / 2), (int) (viewableStars.get(scan).getZ() /
                                megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    g.fillRect((int) (viewableStars.get(scan).getX() /
                            megamileToPixelRatio + xDimension / 2), (int) (viewableStars.get(scan).getZ() /
                            megamileToPixelRatio + yDimension / 3 * 2), 2, 2);

            }
        }
    }
}

