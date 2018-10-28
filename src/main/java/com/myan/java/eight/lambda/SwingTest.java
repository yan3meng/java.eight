package com.myan.java.eight.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by myan on 2018/8/8.
 */
public class SwingTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My Jframe");
        JButton jButton = new JButton("My Button");

       /* jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button");
            }
        });*/
        jButton.addActionListener(event -> System.out.println("Button"));

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
