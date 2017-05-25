package Menus;

import Calculations.Unigen;
import GameFrameWork.Buttons.Button;
import GameFrameWork.Buttons.ButtonDropDown;
import GameFrameWork.Buttons.ButtonNudge;
import GameFrameWork.Buttons.ButtonToggle;
import GameFrameWork.Window;
import World.Galaxy.Universe.Universe;

/**
 * Created by citim on 5/16/2017.
 */
public class MenuUniverseCreation extends Menu {

    private int stars = 10000;
    public MenuUniverseCreation(){
        buttons.add(new Button(60,320,100,40,"Create Universe"));
        buttons.add(new ButtonNudge(60,200,100,40,"stars",100,50000,stars,100));
        buttons.add(new Button(60,280,100,40,"View Universe"));
        buttons.add(new ButtonDropDown(60,240,100,40,"universe type",new String[] {"central mass","spiral"}));
        buttons.add(new Button(60,600,100,40,"back"));
        //universe size
        //universe age?
        //difficulty
        //planet abundance
        //other things that can go on sliders or togglers?
        displayAll();
//        panels.add(new PanelRedBox(200,90,900,600));
            }

    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++) {
            if(buttons.get(scan).clicked) {
                if (scan == 1) {
                    ButtonDropDown dropDown = (ButtonDropDown) buttons.get(4);
                    Unigen.universe = new Universe(stars,dropDown.buttonSelected);
                    System.out.println(Unigen.universe.getNumberOfStars()+" stars");
                    System.out.println(Unigen.universe.getNumberOfHyperSpaceLanes()+" hyperspace lanes");
                    System.out.println(Unigen.universe.xDimension+ " for x dimension");
                    System.out.println(Unigen.universe.yDimension+ " for y dimension");
                    System.out.println(Unigen.universe.zDimension+ " for z dimension");
                    System.out.println(Unigen.universe.getNumberOfPlanets()+" is the number of planets");
                    System.out.println(Unigen.universe.getNumberOfMoons()+" is the number of moons");
                    System.out.println(Unigen.universe.getNumberOfSpaceStations()+" is the number of space Stations");
                    System.out.println(Unigen.universe.getNumberOfWormHoles()+" is the number of wormholes");



                    break;
                }
                if (scan == 2) {
                    ButtonNudge button = (ButtonNudge) buttons.get(2);
                    stars = button.getCurrent();
                    break;
                }
                if (scan == 3) {
                    if(Unigen.universe != null){
                        Window.setMenu(new MenuUniverseDisplay(this));
                    }
                    else System.out.println("universe cannot display without generation!");
                    break;
                }
                if (scan == 5) {
                    Window.setMenu(new MenuGameCreation());
                    break;
                }
            }
            }
    }
}
