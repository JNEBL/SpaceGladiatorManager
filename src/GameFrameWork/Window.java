package GameFrameWork;

import Fighters.Gladiator.DataBaseGrabberGladiator.GladiatorDataBase;
import Player.Player.Player;

import javax.swing.*;
import java.awt.*;

/**
 * Created by student5 on 5/8/17.
 */
public class Window extends JFrame{
    static int xClick = 0,yClick = 0;
    public Window(){
        super("GenericGame");
        setSize(1280,720);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paint(getGraphics());
        play();
    }
    public void play(){
        Graphics g = getGraphics();
        g.drawOval(5,5,300,300);
    }
}
