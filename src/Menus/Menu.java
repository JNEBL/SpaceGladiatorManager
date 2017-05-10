package Menus;

import GameFrameWork.Button;

import java.util.ArrayList;

/**
 * Created by citim on 5/10/2017.
 */
public interface Menu {
    ArrayList<Button> buttons = new ArrayList<>();

    public void display();

}
