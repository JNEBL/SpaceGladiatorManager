package GameFrameWork;

import Fighters.Gladiator.DataBaseGrabberGladiator.GladiatorDataBase;
import Player.Player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by student5 on 5/8/17.
 */
public class Window extends JFrame{
    static int xClick = 0,yClick = 0;
    static Window window;
    public ArrayList<Button> buttons = new ArrayList<>();
    public Window(){
        super("GenericGame");
        setSize(1280,720);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paint(getGraphics());
        play();
        window = this;
    }
    public void play(){
        Graphics g = getGraphics();
        g.drawOval(5,5,300,300);
    }
    public void displayButtons(){
        getGraphics().setColor(Color.white);
        getGraphics().drawRect(0,0,1280,720);
        getGraphics().setColor(Color.black);
        for (int scan = 0; scan < buttons.size(); scan++)
            buttons.get(scan).displayButton();
    }
//    public void displayButtons(ArrayList<Button> buttons){
//        for (int scan = 0; scan < buttons.size(); scan++)
//            buttons.get(scan).displayButton();
//    }
    public void voidButtons(Button button){
        for (int scan = 0;buttons.size() > scan; scan++){
            if(buttons.get(scan) == button){
                buttons.remove(scan);
                scan--;
            }
        }
    }
    public void voidButtons(ArrayList<Button> buttons){
        for(int scan = 0; scan < buttons.size(); scan++){
            voidButtons(buttons.get(scan));
        }
    }
    public void questionButtons(){
        for (int scan = 0; scan < buttons.size(); scan++)
            buttons.get(scan).questionClicked();
    }


}
