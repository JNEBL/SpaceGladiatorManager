package Menus;

import GameFrameWork.Buttons.Button;
import GameFrameWork.Window;

/**
 * Created by citim on 5/10/2017.
 */
public class MenuGameCreation extends Menu {

    public MenuGameCreation(){
        buttons.add(new Button(80,200,100,40,"Create Universe"));
        buttons.add(new Button(80,240,100,40,"Back"));
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
