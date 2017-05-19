package Menus;

import Calculations.Unigen;
import GameFrameWork.Buttons.Button;
import GameFrameWork.Buttons.ButtonSlider;
import GameFrameWork.Window;
import World.Galaxy.Universe.Universe;

/**
 * Created by citim on 5/16/2017.
 */
public class MenuUniverseCreation extends Menu {

    public MenuUniverseCreation(){
        buttons.add(new Button(1100,600,100,40,"Create Universe"));
        buttons.add(new ButtonSlider(60,200,500,25,"stars",1000,1));
        //universe size
        //universe age?
        //difficulty
        //planet abundance
        //other things that can go on sliders or togglers?
        displayAll();
    }
    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++) {
            if(buttons.get(scan).clicked) {
                if (scan == 1) {
                    ButtonSlider b = (ButtonSlider)buttons.get(2);
                    Unigen.universe = new Universe(b.pointAt);
                    break;
                }
            }
            }
    }
}
