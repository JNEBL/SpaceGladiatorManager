package GameFrameWork;

import java.util.ArrayList;

/**
 * Created by citim on 5/9/2017.
 */
public class DropDownButton extends Button {
    String[] buttons;
    public DropDownButton(int x, int y, int xDimesion, int yDimension, String name,String[] buttons){
        super(x,y,xDimesion,yDimension,name);
        this.buttons = buttons;
    }
    public boolean questionClicked(){
        if  ((Window.window.xClick > x &&
                Window.window.xClick < x+xDimesion )&&
                (Window.window.yClick > y &&
                        Window.window.yClick < y+yDimension)) {
            displayDrop();
            return true;
        }
        return false;
    }
    public void displayDrop(){
        ArrayList<Button> buttons = new ArrayList<>();
        for(int scan = 0; scan < this.buttons.length; scan++){
            buttons.add(new Button(x,y+yDimension+2,xDimesion,yDimension,this.buttons[scan]));
            //make window display this
            Window.window.displayButtons(buttons);
        }
    }
}
