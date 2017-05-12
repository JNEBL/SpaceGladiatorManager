package GameFrameWork.Buttons;

import GameFrameWork.Buttons.Button;
import GameFrameWork.Window;

import java.util.ArrayList;

/**
 * Created by citim on 5/9/2017.
 */
public class ButtonDropDown extends Button {
    String[] buttonNames;
    ArrayList <Button> buttons = new ArrayList<>();
    boolean open = false;
    public ButtonDropDown(int x, int y, int xDimesion, int yDimension, String name, String[] buttons){
        super(x,y,xDimesion,yDimension,name);
        buttonNames = buttons;
    }
    public void questionClicked(){
        if  ((Window.window.xClick > x &&
                Window.window.xClick < x+xDimesion )&&
                (Window.window.yClick > y &&
                        Window.window.yClick < y+yDimension)) {
            if(!open)
            displayDrop();
            else
                voidDrop();
            clicked = true;
        }
        clicked = false;
    }
    public void displayDrop(){
        for(int scan = 0; scan < this.buttonNames.length; scan++) {
            buttons.add(new Button(x,   y+((scan+1)*(yDimension + 2)), xDimesion, yDimension, buttonNames[scan]));
            //make window display this
        }
            Window.getMenu().buttons.addAll(buttons);
            Window.getMenu().displayButtons();
            open = true;
        }

    public void voidDrop(){
        Window.getMenu().voidButtons(buttons);
        Window.getMenu().displayButtons();
        buttons = new ArrayList<>();
        open = false;
    }
}
