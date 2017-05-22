package Menus;

import GameFrameWork.Buttons.Button;
import GameFrameWork.Window;

/**
 * Created by citim on 5/22/2017.
 */
public class MenuCredits extends Menu {
    public MenuCredits() {
        buttons.add(new Button(60, 600, 100, 40, "Back"));
    }

    public void questionPressed() {
        for (int scan = 1; scan < buttons.size(); scan++) {
            if (buttons.get(scan).clicked) {
                if (scan == 1) {
                    Window.window.setMenu(new MenuBootScreen());
                    break;
                }
            }
        }
    }
}