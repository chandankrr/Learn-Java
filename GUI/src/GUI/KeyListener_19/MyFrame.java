package GUI.KeyListener_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("resources\\rocket.png");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
//        label.setBackground(Color.red);
//        label.setOpaque(true);

        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        keyTyped = Invoked when a key is typed. uses keyChar, char output

//        switch (e.getKeyChar()) {
//            case 'a':
//                label.setLocation(label.getX() - 10, label.getY());
//                break;
//            case 'w':
//                label.setLocation(label.getX(), label.getY() - 10);
//                break;
//            case 's':
//                label.setLocation(label.getX(), label.getY() + 10);
//                break;
//            case 'd':
//                label.setLocation(label.getX() + 10, label.getY());
//                break;
//        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        keyPressed = Invoked when a physical key is pressed down. uses keyCode, int output
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
//        keyReleased = called whenever a button is released
        System.out.println("You pressed kry char: " + e.getKeyChar());
        System.out.println("You pressed kry code: " + e.getKeyCode());

    }
}
