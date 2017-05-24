package GameFrameWork;

import Menus.*;

import java.awt.*;

/**
 * Created by citim on 5/22/2017.
 */
public class PanelTextBox extends Panel {

    String text;
    public PanelTextBox(int x, int y, int xDimension, int yDimension,String text, Menus.Menu menu){
        super(x,y,xDimension,yDimension,menu);
        this.text = text+" ";
        display();
    }
    public void questionPressed(){

    }
    public void displayComponent(){
        int xPosition = x+10, yPosition = y+25;

        //for length of text. find spaces that you can use to go to the next line once over a char limit. print these lines on a board
        for(int scan = 0; scan < text.length(); scan++){
            boolean newLineNeeded = false;
            if (xPosition > xDimension-10) newLineNeeded = true;
            if (text.substring(scan,scan+1).equals(" ") && newLineNeeded){
                yPosition+=25;//make a new line
                xPosition = x+10;
            }
            else {
                Window.window.getGraphics().drawString(text.substring(scan,scan+1),xPosition,yPosition);
                if(text.substring(scan,scan+1).equals("i")||text.substring(scan,scan+1).equals("t")||text.substring(scan,scan+1).equals("l")||text.substring(scan,scan+1).equals("r")||text.substring(scan,scan+1).equals("f")||text.substring(scan,scan+1).equals("j"))
                xPosition+=4;
                else if(text.substring(scan,scan+1).equals("m")||text.substring(scan,scan+1).equals("w"))
                    xPosition+=10;
                else xPosition+=7;
            }
        }
    }
}
