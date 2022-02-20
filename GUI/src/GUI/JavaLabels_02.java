package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JavaLabels_02 {
    public static void main(String[] args) {
        // JLabel = a GUI area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("D:\\Java\\GUI\\resources\\CodingBoy.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code"); // set text for label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, Center, BOTTOM of image icon
        label.setForeground(new Color(0x00FF00)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN,50)); // set font of text
        label.setIconTextGap(-25); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border around label
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text with in label
        // label.setBounds(100,100,250,250); // set x,y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500,500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
