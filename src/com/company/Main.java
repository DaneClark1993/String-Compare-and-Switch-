package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String name1;
        String name2;

        name1 = JOptionPane.showInputDialog("Enter the first name: ");
        name2 = JOptionPane.showInputDialog("Enter the second name: ");

        if (name1.compareToIgnoreCase(name2) == 0 )
        {
            JOptionPane.showMessageDialog(null,"The names are the same");
        }
        else if (name1.compareToIgnoreCase(name2) < 0)
        {
            JOptionPane.showMessageDialog(null, name1 + " " + name2);
        }
        else if (name1.compareToIgnoreCase(name2) > 0)
        {
            JOptionPane.showMessageDialog(null, name2 + " " + name1);
        }
        System.exit(0);

    }
}
