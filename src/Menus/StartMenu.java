package Menus;


import GameFrameWork.Button;

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
}
