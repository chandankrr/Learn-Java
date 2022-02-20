package GUI.MouseListener_20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("resources\\smile.png");
        nervous = new ImageIcon("resources\\nervous.png");
        pain = new ImageIcon("resources\\pain.png");
        dizzy = new ImageIcon("resources\\dizzy.png");

        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        Invoked when the mouse button has been clicked | pressed and released on a component
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        Invoked when a mouse button has been pressed on a component
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        Invoked when a mouse button has been released on a component
        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        Invoked when the mouse enters a component
        label.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        Invoked when the mouse exits a component
        label.setIcon(smile);
    }
}
