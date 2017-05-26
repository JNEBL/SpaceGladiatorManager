package GameFrameWork;

import Calculations.Unigen;
import GameFrameWork.Buttons.Button;
import World.Galaxy.Star.Stars.Star;
import World.Galaxy.Universe.Universe;

import java.awt.*;

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
            }
        }
    }
    private boolean inBounds(int x, int y){
        return x >= this.x && x <= xDimension && y >= this.y && y <= yDimension;
    }
    private boolean inView(Star star){
        int distanceViewed = (int)(Unigen.universe.getLargestDimension()*zoomPercent/2); //is the radius of the sphere of your view
        return (Math.abs(star.getX()-xCameraPosition) <= distanceViewed && Math.abs(star.getY()-yCameraPosition) <= distanceViewed && Math.abs(star.getZ()-zCameraPosition) <= distanceViewed);
    }
    public void displayComponent(){
        Graphics g = Window.window.getGraphics();
        if(side.equals("front")){
            for(int scan = 0; Unigen.universe.getStars().size() > scan; scan++){
                if(inBounds((int)(Unigen.universe.getStars().get(scan).getX()/megamileToPixelRatio+xDimension/2),(int)(Unigen.universe.getStars().get(scan).getY()
                        /megamileToPixelRatio+yDimension/3*2))) {
                    g.setColor(Unigen.universe.getStars().get(scan).color);
                    if (Unigen.universe.getStars().get(scan).getSpaceStation().size() != 0)
                        g.drawOval((int) (Unigen.universe.getStars().get(scan).getX()
                                / megamileToPixelRatio + xDimension / 2), (int) (Unigen.universe.getStars().get(scan).getY()
                                / megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    if (Unigen.universe.getStars().get(scan).hasWormHole())
                        g.fillOval((int) (Unigen.universe.getStars().get(scan).getX() / megamileToPixelRatio + xDimension / 2),
                                (int) (Unigen.universe.getStars().get(scan).getY() / megamileToPixelRatio + yDimension / 3 * 2),
                                7, 7);
                    g.fillRect((int) (Unigen.universe.getStars().get(scan).getX() / megamileToPixelRatio + xDimension / 2),
                            (int) (Unigen.universe.getStars().get(scan).getY() / megamileToPixelRatio + yDimension / 3 * 2),
                            2, 2);
                }
            }
        }
        if(side.equals("side")){
            for(int scan = 0; Unigen.universe.getStars().size() > scan; scan++) {
                if (inBounds((int) (Unigen.universe.getStars().get(scan).getZ() / megamileToPixelRatio + xDimension / 2), (int) (Unigen.universe.getStars().get(scan).getY()
                        / megamileToPixelRatio + yDimension / 3 * 2))) {
                    g.setColor(Unigen.universe.getStars().get(scan).color);
                    if (Unigen.universe.getStars().get(scan).getSpaceStation().size() != 0)
                        g.drawOval((int) (Unigen.universe.getStars().get(scan).getZ() /
                                megamileToPixelRatio + xDimension / 2), (int) (Unigen.universe.getStars().get(scan).getY() /
                                megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    if (Unigen.universe.getStars().get(scan).hasWormHole())
                        g.fillOval((int) (Unigen.universe.getStars().get(scan).getZ() /
                                megamileToPixelRatio + xDimension / 2), (int) (Unigen.universe.getStars().get(scan).getY() /
                                megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    g.fillRect((int) (Unigen.universe.getStars().get(scan).getZ() /
                            megamileToPixelRatio + xDimension / 2), (int) (Unigen.universe.getStars().get(scan).getY() /
                            megamileToPixelRatio + yDimension / 3 * 2), 2, 2);
                }
            }
        }
        if(side.equals("top")){
            for(int scan = 0; Unigen.universe.getStars().size() > scan; scan++) {
                if (inBounds((int) (Unigen.universe.getStars().get(scan).getX() / megamileToPixelRatio + xDimension / 2), (int) (Unigen.universe.getStars().get(scan).getZ()
                        / megamileToPixelRatio + yDimension / 3 * 2))) {
                    g.setColor(Unigen.universe.getStars().get(scan).color);
                    if (Unigen.universe.getStars().get(scan).getSpaceStation().size() != 0)
                        g.drawOval((int) (Unigen.universe.getStars().get(scan).getX() /
                                megamileToPixelRatio + xDimension / 2), (int) (Unigen.universe.getStars().get(scan).getZ() /
                                megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    if (Unigen.universe.getStars().get(scan).hasWormHole())
                        g.fillOval((int) (Unigen.universe.getStars().get(scan).getX() /
                                megamileToPixelRatio + xDimension / 2), (int) (Unigen.universe.getStars().get(scan).getZ() /
                                megamileToPixelRatio + yDimension / 3 * 2), 7, 7);
                    g.fillRect((int) (Unigen.universe.getStars().get(scan).getX() /
                            megamileToPixelRatio + xDimension / 2), (int) (Unigen.universe.getStars().get(scan).getZ() /
                            megamileToPixelRatio + yDimension / 3 * 2), 2, 2);
                }
            }
        }
    }
}

