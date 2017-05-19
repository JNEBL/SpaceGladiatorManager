package Menus;

import Calculations.Unigen;
import GameFrameWork.Buttons.Button;
import GameFrameWork.Buttons.ButtonSlider;
import GameFrameWork.Panel;
import GameFrameWork.PanelRedBox;
import GameFrameWork.Window;
import World.Galaxy.Universe.Universe;

/**
 * Created by citim on 5/16/2017.
 */
public class MenuUniverseCreation extends Menu {

    private Integer stars = 50;
    public MenuUniverseCreation(){
        buttons.add(new Button(1100,600,100,40,"Create Universe"));
        buttons.add(new ButtonSlider(60,200,500,25,"stars",1000,stars));
        //universe size
        //universe age?
        //difficulty
        //planet abundance
        //other things that can go on sliders or togglers?
        displayAll();
        panels.add(new PanelRedBox(200,100,500,500));
            }

    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++) {
            if(buttons.get(scan).clicked) {
                if (scan == 1) {
                    System.out.println("\nStarted world generation");
                    Unigen.universe = new Universe(500);
                    System.out.println("Ended world generation");
                    System.out.println(Unigen.universe.getNumberOfStars()+" stars");
                    System.out.println(Unigen.universe.getNumberOfHyperSpaceLanes()+" hyperspace lanes");
                    System.out.println(Unigen.universe.xDimension+ " for x dimension");
                    System.out.println(Unigen.universe.yDimension+ " for y dimension");
                    System.out.println(Unigen.universe.zDimension+ " for z dimension");
                    System.out.println(Unigen.universe.getNumberOfPlanets()+" is the number of planets");
                    System.out.println(Unigen.universe.getNumberOfMoons()+" is the number of moons");
                    System.out.println(Unigen.universe.getNumberOfSpaceStations()+" is the number of space Stations");



                    break;
                }
                if (scan == 2) {
                    break;
                }
            }
            }
    }
}
