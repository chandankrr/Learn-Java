package GUI;

import javax.swing.*;

public class JOptionPane_10 {
    public static void main(String[] args) {
/*
        JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of
        something
        JOptionPane.showMessageDialog(null, "This is some useless info", "Simple Error",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info", "Info Error",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info", "Question Error",
                JOptionPane.QUESTION_MESSAGE);
        while (true) {
            JOptionPane.showMessageDialog(null, "your computer has a VIRUS!!!", "Warning Error",
                    JOptionPane.WARNING_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "This is some useless info", "Error",
                JOptionPane.ERROR_MESSAGE);
*/


/*
        int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "Confirm Message",
                 JOptionPane.YES_NO_CANCEL_OPTION);

         System.out.println(answer);
*/


/*
        String ans = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, your name is " + ans);
*/


        String[] responses = {"No, you're awesome!", "Thank you", "Blush"};


        
        ImageIcon icon = new ImageIcon("resources\\thumbsup.png");
        int ans = JOptionPane.showOptionDialog(null, "You are awesome", "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 1);

        System.out.println(ans);

    }
}