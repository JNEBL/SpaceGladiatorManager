package GameFrameWork.Buttons;

/**
 * Created by citim on 5/19/2017.
 */
public class ButtonTyped extends Button {
    String dataType;
    public ButtonTyped(int x, int y, int xDimension, int yDimension, String name, String dataType){
        super(x,y,xDimension,yDimension,name);
        this.dataType = dataType;
    }
}
