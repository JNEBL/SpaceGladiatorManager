package Menus;

import Calculations.Unigen;
import GameFrameWork.Buttons.Button;
import GameFrameWork.PanelRedBox;
import GameFrameWork.Window;

/**
 * Created by citim on 5/22/2017.
 */
public class MenuUniverseDisplay extends Menu{
    private Menu previousMenu;
    private double megamileToPixelRatio;
    public MenuUniverseDisplay(Menu previousMenu){
        this.previousMenu = previousMenu;
        buttons.add(new Button(60,600,100,25,"back"));
        megamileToPixelRatio = Unigen.universe.xDimension/Window.window.y;
        if(Unigen.universe.yDimension/Window.window.y < megamileToPixelRatio)megamileToPixelRatio = Unigen.universe.xDimension/Window.window.y;
        if(Unigen.universe.zDimension/Window.window.y < megamileToPixelRatio)megamileToPixelRatio = Unigen.universe.zDimension/Window.window.y;
        panels.add(new PanelRedBox(0,0,Window.window.getX()-5,Window.window.getY()-100,megamileToPixelRatio));
        displayAll();
    }
    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++) {
        if(buttons.get(scan).clicked) {
            if (scan == 1) {
                Window.setMenu(previousMenu);
                break;
            }
        }
        }
    }



}
