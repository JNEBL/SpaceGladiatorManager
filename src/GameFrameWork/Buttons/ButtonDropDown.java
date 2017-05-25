package GameFrameWork.Buttons;

import GameFrameWork.Buttons.Button;
import GameFrameWork.Window;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by citim on 5/9/2017.
 */
public class ButtonDropDown extends Button {
    String[] buttonNames;
    ArrayList <Button> buttons = new ArrayList<>();
    ArrayList<Button> subButtons = new ArrayList<>();
    public String buttonSelected;
    boolean open = false;
    public ButtonDropDown(int x, int y, int xDimesion, int yDimension, String name, String[] buttons){
        super(x,y,xDimesion,yDimension,name);
        buttonNames = buttons;
        buttonSelected = buttons[0];
    }
    public void displayButton(){
        Graphics g = GameFrameWork.Window.window.getGraphics();
        g.setColor(Color.darkGray);
        g.fillRect(x,y,xDimesion,yDimension);
        g.setColor(Color.lightGray);
        g.fillRect(x+2,y+2,xDimesion-4, yDimension-4);
        g.setColor(Color.black);
        g.drawString(buttonSelected,x+5,y+yDimension/2);
    }
    public void questionClicked(){
        clicked = false;
        if  ((Window.xClick > x &&
                Window.xClick < x+xDimesion )&&
                (Window.yClick > y &&
                        Window.yClick < y+yDimension)) {
            if(!open)
            displayDrop();
            else
                voidDrop();
            clicked = true;
        }
        else if(open){
            for(int scan = 0; scan < buttonNames.length; scan++){
                subButtons.get(scan).questionClicked();
                if(subButtons.get(scan).clicked){
                    buttonSelected = buttonNames[scan];
                    break;
                }
                voidDrop();
            }
        }
    }
    public void displayDrop(){
        for(int scan = 0; scan < this.buttonNames.length; scan++) {
            subButtons.add(new Button(x+xDimesion,   y+((scan+1)*(yDimension + 2)-yDimension), xDimesion, yDimension, buttonNames[scan]));
            //make window display this
        }
        for(int scan = 0; scan < this.buttonNames.length; scan++){
            subButtons.get(scan).displayButton();
        }
            open = true;
        }

    public void voidDrop(){
        Window.getMenu().displayAll();
        buttons = new ArrayList<>();
        open = false;
    }
}
