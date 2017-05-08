package GameFrameWork;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by student5 on 5/8/17.
 */
public class Mouse implements MouseListener{
    public void mouseEntered(MouseEvent mouseEvent){

    }
    public void mouseClicked(MouseEvent mouseEvent){

    }
    public void mousePressed(MouseEvent mouseEvent){
        Window.xClick = mouseEvent.getX();
        Window.yClick = mouseEvent.getY();
    }
    public void mouseExited(MouseEvent mouseEvent){

    }
    public void mouseReleased(MouseEvent mouseEvent){

    }
    public void mouseDragging(MouseEvent mouseEvent){

    }
}
