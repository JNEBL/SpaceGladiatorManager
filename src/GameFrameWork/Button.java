package GameFrameWork;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 * Created by student5 on 5/8/17.
 */
public class Button {
    int x,y, xDimesion, yDimension;
    String name;
    public Button(int x, int y, int xDimesion, int yDimension, String name){
        this.x = x;
        this.y = y;
        this.xDimesion = xDimesion;
        this.yDimension = yDimension;
        this.name = name;
    }
    public boolean questionClicked(){
        if  ((Window.window.xClick > x &&
                Window.window.xClick < x+xDimesion )&&
                (Window.window.yClick > y &&
                Window.window.yClick < y+yDimension)){
            System.out.println("you clicked "+name);
            return true;
        }
        return false;
    }
    public void displayButton(){

        Graphics g = Window.window.getGraphics();
        g.setColor(Color.gray);
        g.fillRect(x,y,xDimesion, yDimension);
        g.setColor(Color.black);
        g.drawString(name,x+5,y+yDimension/2);
    }

}
