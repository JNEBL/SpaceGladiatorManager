package GameFrameWork;

import GameFrameWork.Buttons.Button;

import java.awt.*;

public class PanelRedBox extends Panel {
    private String side = "front";
    public PanelRedBox(int x, int y, int xDimension, int yDimension,Menus.Menu menu){
        super(x,y,xDimension,yDimension,menu);
        buttons.add(new Button(x,y+yDimension-yDimension/8,xDimension/3,yDimension/8,"front"));
        buttons.add(new Button(x+xDimension/3,y+yDimension-yDimension/8,xDimension/3,yDimension/8,"side"));
        buttons.add(new Button(x+2*(xDimension/3),y+yDimension-yDimension/8,xDimension/3,yDimension/8,"top"));
    }
    public void questionPressed() { //this is a template. an if scan== x is needed per button
        for (int scan = 1; scan < buttons.size(); scan++) {
            if (buttons.get(scan).clicked) {
                if (scan == 1) {
                    side = "front";
                    break;
                }
                if (scan == 2) {
                    side = "side";
                    break;
                }if (scan == 3) {
                    side = "top";
                    break;
                }
            }
        }
        display();
    }
    public void displayComponent(){
        Graphics g = Window.window.getGraphics();
        if(side.equals("front")){
            g.setColor(Color.red);
            g.fillRect(x+5,y+5,xDimension-5,yDimension-yDimension/4);
        }
        if(side.equals("side")){
            g.setColor(Color.blue);
            g.fillRect(x+5,y+5,xDimension-5,yDimension-yDimension/4);
        }
        if(side.equals("top")){
            g.setColor(Color.white);
            g.fillRect(x+5,y+5,xDimension-5,yDimension-yDimension/4);
        }
    }
}

