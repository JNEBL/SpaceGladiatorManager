package GameFrameWork.Buttons;

import java.awt.*;

/**
 * Created by citim on 5/16/2017.
 */
public class ButtonToggle extends Button {
    public boolean state;

    public ButtonToggle(int x, int y, int xDimesion, int yDimension, String name, boolean state){
        super(x,y,xDimesion,yDimension,name);
        this.state = state;
    }
    public void questionClicked() {
        if ((GameFrameWork.Window.xClick > x &&
                GameFrameWork.Window.xClick < x + xDimesion) &&
                (GameFrameWork.Window.yClick > y &&
                        GameFrameWork.Window.yClick < y + yDimension)){
            state = !state;
            clicked = true;
            displayButton();
        }
        else clicked = false;
    }
    public void displayButton(){
        Graphics g = GameFrameWork.Window.window.getGraphics();
        g.setColor(Color.darkGray);
        g.fillRect(x,y,xDimesion,yDimension);
        if(state)
        g.setColor(Color.lightGray);
        else
            g.setColor(Color.GRAY);
        g.fillRect(x+2,y+2,xDimesion-4, yDimension-4);
        g.setColor(Color.black);
        g.drawString(name,x+5,y+yDimension/2);
    }
    public void toggle(){
        state = !state;
        displayButton();
    }
}
