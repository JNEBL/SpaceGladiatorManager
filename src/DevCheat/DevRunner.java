package DevCheat;

import GameFrameWork.*;

public class DevRunner {
    public static void main(String args[]){
        Window window = new Window();
        window.addMouseListener(new Mouse());
        window.addKeyListener(new Keyboard());
        window.refreshDisplay();
    }
}
