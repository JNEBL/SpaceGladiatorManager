package GameFrameWork;

import GameFrameWork.Buttons.Button;

import java.awt.*;
import java.util.ArrayList;

import static GameFrameWork.Window.*;

/**
 * Created by citim on 5/19/2017.
 */
public abstract class Panel {
    ArrayList<Button> buttons = new ArrayList<>();
    public int x, y, xDimension, yDimension;

    public Panel(int x, int y, int xDimension, int yDimension){
        this.x = x;
        this.y = y;
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        buttons.add(new Button(0,0,0,0,""));
    }

    public void display(){
        displayFrame();
        displayButtons();
        displayComponent();
    }
    private void displayFrame(){
        Window.window.getGraphics().setColor(Color.darkGray);
        Window.window.getGraphics().fillRect(x,y,xDimension,yDimension);
    }
    private void displayButtons(){
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
