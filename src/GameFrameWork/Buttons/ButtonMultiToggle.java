package GameFrameWork.Buttons;

import java.util.ArrayList;


public class ButtonMultiToggle extends Button{
    private String[] buttonNames;
    private ArrayList<ButtonToggle> subButtons = new ArrayList<>();
    private int buttonOn = 0;
    public ButtonMultiToggle(int x, int y, int xDimension, int yDimension, String name, String[] buttonNames){
        super(x,y,xDimension,yDimension, name);
        this.buttonNames = buttonNames;
        for(int scan = 0; scan < buttonNames.length; scan++){
            if(scan == 0)
                subButtons.add(new ButtonToggle(x,y,xDimension,yDimension,"",true));
            else
                subButtons.add(new ButtonToggle(x+xDimension*scan,y,xDimension,yDimension,"",false));

        }
    }
    public void displayButton(){
        for(int scan = 0; scan < buttonNames.length; scan++){
            subButtons.get(scan).displayButton();
        }
    }
    public void questionClicked(){
        for(int scan = 0; scan < buttonNames.length; scan++){
            if(buttonOn != scan)
                subButtons.get(scan).questionClicked();
            if(subButtons.get(scan).clicked)
                buttonOn = scan;
        }
        for(int scan = 0; scan < buttonNames.length; scan++){
            if(scan!= buttonOn &&subButtons.get(scan).state)subButtons.get(scan).toggle();
        }

    }
}
