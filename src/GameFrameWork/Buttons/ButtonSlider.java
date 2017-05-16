package GameFrameWork.Buttons;

import GameFrameWork.*;
import GameFrameWork.Window;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;

/**
 * Created by citim on 5/16/2017.
 */
public class ButtonSlider extends Button{
    private int points;
    public int pointAt = 0; //could be reasigned so that certain settings are in the middle by default
    public ButtonSlider(int x, int y, int xDimesion, int yDimension, String name, int points) {
        super(x, y, xDimesion, yDimension, name);
        this.points = points;
        if (points < 2) {
            System.out.println("error: ButtonSlider created with less than 2 points");
            System.exit(0);
        }
    }
    public void questionClicked() {
        if ((GameFrameWork.Window.xClick > x &&
                GameFrameWork.Window.xClick < x + xDimesion) &&
                (GameFrameWork.Window.yClick > y &&
                        GameFrameWork.Window.yClick < y + yDimension)){

//            while (Window.holdingMouse) //dont know why this isnt working
            {
                int tempPointAt = 0;
                for(int scan = 0; scan < points+1; scan++){
                    if(Window.xClick < (x+(xDimesion/points)*scan)+xDimesion/points && Window.xClick > (x+(xDimesion/points)*scan)-xDimesion/points  )
                        tempPointAt = scan;
                }
                pointAt = tempPointAt;
                Graphics g = Window.window.getGraphics();
                g.setColor(Color.gray);
                g.fillRect(x+2,y+2,xDimesion-4, yDimension-4);
                g.setColor(Color.lightGray);
                g.fillRect(x+2,y+2,((xDimesion-4)/points)*pointAt,yDimension-4);
            }
            System.out.println(pointAt);
            clicked = true;
            displayButton();
        }
        else clicked = false;
    }
    public void displayButton(){

        Graphics g = GameFrameWork.Window.window.getGraphics();
        g.setColor(Color.darkGray);
        g.fillRect(x,y,xDimesion,yDimension);
        g.setColor(Color.gray);
        g.fillRect(x+2,y+2,xDimesion-4, yDimension-4);
        g.setColor(Color.lightGray);
        g.fillRect(x+2,y+2,((xDimesion-4)/points)*pointAt,yDimension-4);
        g.setColor(Color.black);
        g.drawString(name,x+5,y+yDimension/2);
    }

}
