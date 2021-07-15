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
        System.out.print("Enter either 1, 2 or 3: ");
        int number = input.nextInt();

        switch (number) {
            case 1 -> JOptionPane.showMessageDialog(null, "You entered 1");
            case 2 -> JOptionPane.showMessageDialog(null, "You entered 2");
            case 3 -> JOptionPane.showMessageDialog(null, "You entered 3");
            default -> JOptionPane.showMessageDialog(null, "You entered neither 1, 2 or 3");
        }
        System.exit(0);


    }
}
