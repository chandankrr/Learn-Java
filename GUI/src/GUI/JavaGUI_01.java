package GUI;

import javax.swing.*;
import java.awt.*;

public class JavaGUI_01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // set title of frame
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // restrict user to close pop up window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420,420); // set the x-dimension and y-dimension of frame
        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("D:\\Java\\GUI\\resources\\logo.png"); // create an ImageIcon
        frame.setIconImage(image.getImage()); // change icon of frame
        // frame.getContentPane().setBackground(new Color(128,128,128)); // change color of background
        frame.getContentPane().setBackground(new Color(0x123456)); // change color of background
    }
}
