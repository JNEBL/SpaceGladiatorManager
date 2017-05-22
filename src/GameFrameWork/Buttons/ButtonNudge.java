package GameFrameWork.Buttons;

public class ButtonNudge extends Button {
    private int min, max, nudgeBy;
    private Button left, right;
    private String name;
    private Integer current;
    public ButtonNudge(int x, int y, int xDimension, int yDimension, String name, int min, int max, int current,int nudgeBy){
        super(x+25,y,xDimension,yDimension,name+" : "+current);
        this.name = name;
        this.min = min;
        this.max = max;
        this.current = current;
        left = new Button(x,y,25,yDimension,"-");
        right = new Button(x+xDimension+25,y,25,yDimension,"+");
        this.nudgeBy = nudgeBy;
    }
    public void questionClicked(){
        left.questionClicked();
        right.questionClicked();
        if (left.clicked&&current-nudgeBy >= min){
            current-=nudgeBy;
            clicked = true;
        }
        if(right.clicked && current+nudgeBy <= max){
            current+=nudgeBy;
            clicked = true;
        }
        super.name = name +" : "+current;
        displayButton();
    }
    public void displayButton(){
        left.displayButton();
        right.displayButton();
        super.displayButton();
    }
    public int getCurrent(){
        return current;
    }


}
