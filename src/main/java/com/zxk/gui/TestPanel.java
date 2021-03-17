package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel {
    public static void main(String[] args) {

        Frame frame = new Frame();
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(47, 163, 35));
        panel.setBounds(0,0,250,250);
        panel.setBackground(new Color(184, 65, 67));

        frame.add(panel);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //强制退出
                System.exit(0);
            }
        });
    }
}
