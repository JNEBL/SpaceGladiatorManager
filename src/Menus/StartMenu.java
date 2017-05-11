package Menus;


import GameFrameWork.Button;
import GameFrameWork.Window;

import javax.swing.*;


/**
 * Created by jnebl on 5/6/2017.
 */
public class StartMenu extends Menu{
    public StartMenu(){
        super();
        buttons.add(new Button(80,200,100,40,"Start"));
        buttons.add(new Button(80,240,100,40,"Quit"));
    }
    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++){
            if(buttons.get(scan).clicked){
                if(scan == 1){
                    Window.menu = new GameCreation();
                    Window.window.refreshDisplay();
                    break;
                }
                if(scan == 2) {

                    System.out.println("you quit the game");
                    System.exit(0);
                }
            }
        }
    }
}
