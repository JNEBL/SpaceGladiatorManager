package GameFrameWork.Buttons;
import GameFrameWork.Window;

import java.awt.*;
import java.util.ArrayList;

public class ButtonDropDown extends Button {
    private String[] buttonNames;
    private ArrayList<Button> subButtons = new ArrayList<>();
    public String buttonSelected;
    private boolean open = false;
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
            for(int scan = 0; scan < subButtons.size(); scan++){
                subButtons.get(scan).questionClicked();
                if(subButtons.get(scan).clicked){
                    buttonSelected = buttonNames[scan];
                    voidDrop();

                }
            }
        }
    }
    private void displayDrop(){
        for(int scan = 0; scan < this.buttonNames.length; scan++) {
            subButtons.add(new Button(x+xDimesion,   y+yDimension*scan, xDimesion, yDimension, buttonNames[scan]));
            //make window display this
        }
        for(int scan = 0; scan < this.buttonNames.length; scan++){
            subButtons.get(scan).displayButton();
        }
            open = true;
        }

    private void voidDrop(){
        Window.getMenu().displayAll();
        subButtons = new ArrayList<>();
        open = false;
    }
}
