package GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayout_07 {
    public static void main(String[] args) {
        // Layout Manager = defines the natural layout for components within a container

        // Grid Layout = places components in a grid of calls.
        //               each component's takes all the available space within its cell,
        //               and each cell is the same size

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new java.awt.GridLayout(3,3,10,10));

        // JButton button1 = new JButton("1");
        // frame.add(button1);

        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));
        frame.add(new Button("7"));
        frame.add(new Button("8"));
        frame.add(new Button("9"));

        frame.setVisible(true);
    }
}
