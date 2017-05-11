package Menus;

import GameFrameWork.Button;

/**
 * Created by citim on 5/10/2017.
 */
public class GameCreation extends Menu {
    public void questionPressed(){

    }
    public GameCreation(){
        buttons.add(new Button(100,100,100,40,"working?"));
        displayAll();
    }

}
