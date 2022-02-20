package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame_04 extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame_04(){

        ImageIcon icon = new ImageIcon("D:\\Java\\GUI\\resources\\pointing.png");
        ImageIcon icon2 = new ImageIcon("D:\\Java\\GUI\\resources\\thumbsup.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        // button.addActionListener(e -> System.out.println("poo"));
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,15));
        button.setIconTextGap(-10);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            label.setVisible(true);
            System.out.println("poo");
        }
    }
}
