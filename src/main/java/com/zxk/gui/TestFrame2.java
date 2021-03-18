package gui;

import java.awt.*;

/**
 * @author zxk
 */
public class TestFrame2 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100,200,300,400,Color.BLACK);
        MyFrame myFrame2 = new MyFrame(100,200,300,400,Color.DARK_GRAY);
        MyFrame myFrame3 = new MyFrame(100,200,300,400,Color.RED);
    }
}

class MyFrame extends Frame {
    static int id = 0;

    public MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame:"+(++id));
        setBackground(color);
        setSize(w,h);
        setLocation(x,y);
        setVisible(true);
    }
}
