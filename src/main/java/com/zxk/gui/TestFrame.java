package gui;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个GUI窗口");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setBackground(new Color(39, 77, 110));
        frame.setLocation(300,300);
    }
}
