package Menus;

import GameFrameWork.Buttons.ButtonSelection;
import GameFrameWork.Buttons.ButtonSlider;
import GameFrameWork.Buttons.ButtonToggle;

/**
 * Created by student5 on 5/12/17.
 */
public class MenuCharacterSelection extends Menu {

    public MenuCharacterSelection(){
        buttons.add(new ButtonSelection(80,200,"Jim","A lone wolf and a great explorer."));
        buttons.add(new ButtonToggle(80,300,100,25,"toggle!",false));
    }
    public void questionPressed(){

    }

}
