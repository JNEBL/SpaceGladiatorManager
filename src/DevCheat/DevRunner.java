package DevCheat;

import Fighters.Gladiator.DataBaseGrabberGladiator.GladiatorDataBase;
import Player.Player.Player;

/**
 * Created by jnebl on 5/6/2017.
 */
public class DevRunner {
    public static void main(String args[]){
        Player player = new Player();
        for (int x = 0;x < 20;x++)
            player.addGladiator(GladiatorDataBase.getVampireCharacter());
        System.out.println(player.getGladiators().size());
    }
}
