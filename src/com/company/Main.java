package com.company;
import javax.swing.*;
import java.util.Scanner;

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


        Scanner input = new Scanner(System.in);
        System.out.print("Enter either A, B or C: ");
        String number = input.nextLine();
        char letter = number.charAt(0);

        switch (letter) {
            case 'a', 'A' -> JOptionPane.showMessageDialog(null, "You entered A");
            case 'b', 'B' -> JOptionPane.showMessageDialog(null, "You entered B");
            case 'c', 'C' -> JOptionPane.showMessageDialog(null, "You entered C");
            default -> JOptionPane.showMessageDialog(null, "You entered neither A, B or C");
        }
        System.exit(0);


    }
}
