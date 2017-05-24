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
    public static boolean holdingMouse = true;
    private static Menu menu = new MenuBootScreen();
    public int x = 1280, y = 720;
    public Window(){
        super("GenericGame");
        setSize(1280,720);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paint(getGraphics());
        window = this;
    }
    public void refreshDisplay(){
        getGraphics().fillRect(0,0,x,y);
        menu.displayAll();
    }

    public static void setMenu(Menu menu){
        Window.menu = menu;
        window.refreshDisplay();
    }
    public static Menu getMenu(){
        return menu;
    }
    public static void questionButtons(){
        menu.questionButtons();
    }
}
