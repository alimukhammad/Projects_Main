package com.example.project.one;
import javax.swing.*;

public class AreaOfRectangle {
    public static void main (String[] args){
        double length = 27.3;
        double width = 13.4;
        double area;

        area = length * width;
        String a = ("TH length of the rectangle is " + length);
        String b = ("\nTH width of the rectangle is " + width);
        String c = ("\nTH are of the rectangle is " + area);
        String output = a + b + c;

        JOptionPane.showMessageDialog(null, output, "QuickTest Program",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
