package Menus;


import GameFrameWork.Buttons.Button;
import GameFrameWork.Window;


/**
 * Created by jnebl on 5/6/2017.
 */
public class MenuBootScreen extends Menu{
    public MenuBootScreen(){
        super();
        buttons.add(new Button(60,200,100,40,"Start"));
        buttons.add(new Button(60,600,100,40,"Quit"));
        buttons.add(new Button(60,560,100,40,"Credits"));
    }
    public void questionPressed(){
        for (int scan = 1; scan < buttons.size(); scan++){
            if(buttons.get(scan).clicked){
                if(scan == 1){
                    Window.setMenu(new MenuGameCreation());
                    break;
                }
                if(scan == 2) {
                    System.out.println("you quit the game!");
                    System.exit(0);
                }
                if(scan == 3){
                    Window.setMenu(new MenuCredits());
                    break;
                }
            }
        }
    }
}
