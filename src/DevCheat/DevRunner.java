package DevCheat;

import Fighters.Gladiator.DataBaseGrabberGladiator.GladiatorDataBase;
import GameFrameWork.Button;
import GameFrameWork.DropDownButton;
import GameFrameWork.Mouse;
import GameFrameWork.Window;
import Player.Player.Player;

/**
 * Created by jnebl on 5/6/2017.
 */
public class DevRunner {
    public static void main(String args[]){
//        Player player = new Player();
//        for (int x = 0;x < 20;x++)
//            player.addGladiator(GladiatorDataBase.getVampireCharacter());
//        System.out.println(player.getGladiators());
        Window window = new Window();
        window.addMouseListener(new Mouse());
        window.buttons.add(new Button(0,0,0,0,""));
        window.buttons.add(new DropDownButton(10,200,250,100,"one",new String[] {"d one","d two","d three"}));
//        window.buttons.add(new Button(10,300,250,100,"two"));
//        window.buttons.add(new Button(10,400,250,100,"three"));
//        window.buttons.add(new Button(10,500,250,100,"four"));
        window.displayButtons();

    }
}
