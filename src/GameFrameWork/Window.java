package GameFrameWork;

import Fighters.Gladiator.DataBaseGrabberGladiator.GladiatorDataBase;
import Menus.*;
import Menus.Menu;
import Player.Player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by student5 on 5/8/17.
 */
public class Window extends JFrame{
    public static int xClick = 0,yClick = 0;
    public static Window window;
    public static Menu menu = new GameCreation();
    public Window(){
        super("GenericGame");
        setSize(1280,720);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paint(getGraphics());
        window = this;
    }


    public void questionButtons(){
        menu.questionButtons();
    }


}
