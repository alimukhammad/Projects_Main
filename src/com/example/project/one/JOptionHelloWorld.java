package com.example.project.one;

import javax.swing.*;

public class JOptionHelloWorld {
    public static void main (String [] args){
        JOptionPane.showMessageDialog(null, "Hello World!",
                " Sample", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Hello World!",
                " Question", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Hello World!",
                " Information", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Hello World!",
                " Error", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "Hello World!",
                " Plain", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
