package GameFrameWork.Buttons;

/**
 * Created by citim on 5/31/2017.
 */
public class ButtonNudgeDouble extends ButtonNudge {
    Button left2, right2;
    int nudgeBy2;

    public ButtonNudgeDouble(int x, int y, int xDimension, int yDimension, String name, int min, int max, int current,int nudgeBy1, int nudgeBy2){
        super(x+25,y,xDimension,yDimension,name,min,max,current,nudgeBy1);
        left2 = new Button(x,y,25,yDimension,"--");
        right2 = new Button(x+xDimension+75,y,25,yDimension,"++");
        this.nudgeBy2 = nudgeBy2;


    }
    public void questionClicked(){
        clicked = false;
        left.clicked = false;
        right.clicked = false;
        left2.clicked = false;
        right2.clicked = false;
        left.questionClicked();
        right.questionClicked();
        left2.questionClicked();
        right2.questionClicked();
        if (left.clicked&&current-nudgeBy >= min){
            current-=nudgeBy;
            clicked = true;
        }
        if(right.clicked && current+nudgeBy <= max){
            current+=nudgeBy;
            clicked = true;
        }
        if (left2.clicked&&current-nudgeBy2 >= min){
            current-=nudgeBy2;
            clicked = true;
        }
        if(right2.clicked && current+nudgeBy2 <= max){
            current+=nudgeBy2;
            clicked = true;
        }
        super.name = name +" : "+current;
        displayButton();
    }
    public void displayButton(){
        left2.displayButton();
        right2.displayButton();
        super.displayButton();
    }
}
