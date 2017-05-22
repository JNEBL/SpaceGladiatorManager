package GameFrameWork;

/**
 * Created by citim on 5/22/2017.
 */
public class PanelTextBox extends Panel {

    String text;
    public PanelTextBox(int x, int y, int xDimension, int yDimension,String text){
        super(x,y,xDimension,yDimension);
    }
    public void questionPressed(){

    }
    public void displayComponent(){
        //for length of text. find spaces that you can use to go to the next line once over a char limit. print these lines on a board
    }
}
