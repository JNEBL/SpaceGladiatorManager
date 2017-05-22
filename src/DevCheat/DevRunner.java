package DevCheat;

import Fighters.Gladiator.DataBaseGrabberGladiator.GladiatorDataBase;
import GameFrameWork.*;
import Player.Player.Player;
import World.Galaxy.Universe.Universe;

/**
 * Created by jnebl on 5/6/2017.
 */
public class DevRunner {
    public static void main(String args[]){
        Window window = new Window();
        window.addMouseListener(new Mouse());
        window.addKeyListener(new Keyboard());
        window.refreshDisplay();
        Window.getMenu().displayAll();
    }
}
