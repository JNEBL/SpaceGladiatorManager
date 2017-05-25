package GameFrameWork;

import GameFrameWork.Buttons.Button;
import Menus.*;

import java.awt.*;
import java.awt.Menu;
import java.util.ArrayList;

import static GameFrameWork.Window.*;

/**
 * Created by citim on 5/19/2017.
 */
public abstract class Panel {
    ArrayList<Button> buttons = new ArrayList<>();
    public int x, y, xDimension, yDimension;
    Menus.Menu menu;

    public Panel(int x, int y, int xDimension, int yDimension, Menus.Menu menu){
        this.x = x;
        this.y = y;
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        buttons.add(new Button(0,0,0,0,""));
        this.menu = menu;
    }

    public void display(){
        displayFrame();
        displayComponent();
        displayButtons();

    }
    private void displayFrame(){
        Graphics g = GameFrameWork.Window.window.getGraphics();
        g.setColor(Color.darkGray);
        g.fillRect(x,y,xDimension,yDimension);

    }
    private void displayButtons(){
        if(menu.equals( Window.getMenu()))
        for(int scan = 0; scan < buttons.size(); scan++){
            buttons.get(scan).displayButton();
        }
    }
    public void questionButtons(){

        for (int scan = 0; scan < buttons.size(); scan++)
            buttons.get(scan).questionClicked();
        questionPressed();
    }
    public abstract void displayComponent();//displays specific component of the panel
    public abstract void questionPressed();//should loop through the buttons you may have clicked.(excludes the value of buttons.get(0)

}
