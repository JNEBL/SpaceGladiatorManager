package GameFrameWork.Buttons;

import GameFrameWork.*;

import java.awt.*;

/**
 * Created by citim on 5/11/2017.
 */
public class ButtonSelection extends GameFrameWork.Buttons.Button {
    String description;
    //image of thing you are selecting. right now it will be a red box.
    public ButtonSelection(int x, int y, String name, String description){
        super(x+5,y+50,100,25,name);

    }
    public void displayButton(){
        Graphics g = GameFrameWork.Window.window.getGraphics();
        g.setColor(Color.darkGray);
        g.fillRect(x,y,xDimesion,yDimension);
        g.setColor(Color.gray);
        g.fillRect(x+2,y+2,xDimesion-4, yDimension-4);
        g.fillRect(x+9,y-115,80,110);
        g.setColor(Color.red);
        g.fillRect(x+22,y-70,50,50);
        g.setColor(Color.black);
        g.drawString(name,x+5,y+yDimension/2);
    }
}
