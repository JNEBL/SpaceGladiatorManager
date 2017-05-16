package GameFrameWork.Buttons;

import GameFrameWork.*;
import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;
import java.awt.Window;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 * Created by student5 on 5/8/17.
 */
public class Button {
    int x,y, xDimesion, yDimension;
    String name;
    public boolean clicked = false;
    public Button(int x, int y, int xDimesion, int yDimension, String name){
        this.x = x;
        this.y = y;
        this.xDimesion = xDimesion;
        this.yDimension = yDimension;
        this.name = name;
    }

    public void questionClicked() {
        clicked = ((GameFrameWork.Window.window.xClick > x &&
                GameFrameWork.Window.window.xClick < x + xDimesion) &&
                (GameFrameWork.Window.window.yClick > y &&
                        GameFrameWork.Window.window.yClick < y + yDimension));
    }
    public void displayButton(){

        Graphics g = GameFrameWork.Window.window.getGraphics();
        g.setColor(Color.darkGray);
        g.fillRect(x,y,xDimesion,yDimension);
        g.setColor(Color.lightGray);
        g.fillRect(x+2,y+2,xDimesion-4, yDimension-4);
        g.setColor(Color.black);
        g.drawString(name,x+5,y+yDimension/2);
    }

}
