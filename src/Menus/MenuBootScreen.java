package Menus;


import GameFrameWork.Buttons.Button;
import GameFrameWork.Window;


/**
 * Created by jnebl on 5/6/2017.
 */
public class MenuBootScreen extends Menu{
    public MenuBootScreen(){
        super();
        buttons.add(new Button(80,200,100,40,"Start"));
        buttons.add(new Button(80,240,100,40,"Quit"));
    }
    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++){
            if(buttons.get(scan).clicked){
                if(scan == 1){
                    Window.window.setMenu(new MenuGameCreation());
                    break;
                }
                if(scan == 2) {

                    System.out.println("you quit the game");
                    System.exit(0);
                }
            }
        }
    }
}
