package Menus;

import GameFrameWork.Buttons.Button;
import GameFrameWork.Buttons.ButtonDropDown;
import GameFrameWork.Buttons.ButtonMultiToggle;
import GameFrameWork.Window;

/**
 * Created by citim on 5/10/2017.
 */
public class MenuGameCreation extends Menu {

    public MenuGameCreation(){
        buttons.add(new Button(60,200,100,40,"Create Universe"));
        buttons.add(new Button(60,600,100,40,"Back"));
        buttons.add(new ButtonMultiToggle(60,240,40,40,"multiToggle",new String[] {"","",""}));
        buttons.add(new ButtonDropDown(60,280,100,40,"drop",new String[] {"one","two","three"}));
    }
    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++) {
            if(buttons.get(scan).clicked) {
                if (scan == 1) {
                    Window.setMenu(new MenuUniverseCreation())
                    ;break;
                }
                if (scan == 2) {
                    Window.setMenu(new MenuBootScreen());
                    break;
                }
            }
        }
    }


}
