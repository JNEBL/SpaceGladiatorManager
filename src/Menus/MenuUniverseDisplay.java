package Menus;

import Calculations.Unigen;
import GameFrameWork.Buttons.Button;
import GameFrameWork.PanelRedBox;
import GameFrameWork.PanelTextBox;
import GameFrameWork.PanelUniverseDisplay;
import GameFrameWork.Window;

import java.util.ArrayList;

/**
 * Created by citim on 5/22/2017.
 */
public class MenuUniverseDisplay extends Menu{
    private Menu previousMenu;
    private double megamileToPixelRatio;
    public MenuUniverseDisplay(Menu previousMenu){
        this.previousMenu = previousMenu;
        buttons.add(new Button(60,600,100,40,"back"));
        megamileToPixelRatio = Unigen.universe.xDimension/Window.window.y;
        if(Unigen.universe.yDimension/Window.window.y < megamileToPixelRatio)megamileToPixelRatio = Unigen.universe.xDimension/Window.window.y;
        if(Unigen.universe.zDimension/Window.window.y < megamileToPixelRatio)megamileToPixelRatio = Unigen.universe.zDimension/Window.window.y;
        panels.add(new PanelUniverseDisplay(25,100,Window.window.x-30,Window.window.y-250,this,megamileToPixelRatio));
    }
    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++) {
        if(buttons.get(scan).clicked) {
            if (scan == 1) {
                panels = new ArrayList<>();
                Window.setMenu(previousMenu);
                break;
            }
        }
        }
    }



}
