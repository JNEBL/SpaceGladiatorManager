package GameFrameWork;

import Menus.*;
import Menus.Menu;

import javax.swing.*;

/**
 * Created by student5 on 5/8/17.
 */
public class Window extends JFrame{
    public static int xClick = 0,yClick = 0;
    public static Window window;
    private static Menu menu = new MenuBootScreen();
    public Window(){
        super("GenericGame");
        setSize(1280,720);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paint(getGraphics());
        window = this;
    }
    public void refreshDisplay(){
        menu.displayAll();
    }

    public void setMenu(Menu menu){
        Window.menu = menu;
        refreshDisplay();
    }
    public static Menu getMenu(){
        return menu;
    }
    public static void questionButtons(){
        menu.questionButtons();
    }
}
