package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Created by your name on 11/22/2015.
 */
public  class hvac extends JFrame {
    private JRadioButton radioButton1;
    private JList JList;
    private JRadioButton radioButton2;
    private JPanel rootPanel;
    private javax.swing.JLabel JLabel;
    private JButton quitButton;
    private ArrayList<List> services;

    private boolean createCentral = true;
    private boolean createFurnace = true;
//    ArrayList<List> list = new ArrayList<>();//
// here trying to add service types- it does not work.
    // still needs some more code(list - resolution)
//    list.add("CENTRAL AC");
//    list.add("FURNACE");

    protected hvac() {
        super("Service call Program");
        setContentPane(rootPanel);
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (createCentral) {
                    if(createCentral = radioButton1.isSelected())
                        JLabel.setText("CENTRAL AC");
                } else JLabel.setText("FURNACE");


            }
        });


        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (createFurnace) {
                    createFurnace = radioButton2.isSelected();
                    JLabel.setText("FURNACE");
                } else JLabel.setText("CENTRAL AC");

            }
        });

        quitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }

                });

    }

    }



