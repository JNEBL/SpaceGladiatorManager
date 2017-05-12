package Menus;

import GameFrameWork.Button;
import GameFrameWork.Window;

/**
 * Created by citim on 5/10/2017.
 */
public class GameCreation extends Menu {

    public GameCreation(){
        buttons.add(new Button(80,200,100,40,"Create Universe"));
        buttons.add(new Button(80,240,100,40,"Back"));
        displayAll();
    }
    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++) {
            if(buttons.get(scan).clicked) {
                if (scan == 1) {
                    //code for making a universe
                    break;
                }
                if (scan == 2) {
                    Window.window.setMenu(new StartMenu());
                    break;
                }
            }
        }
    }


}
