/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colourchanger;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rohan_nu3d8wo
 */
public class ColourChanger extends JFrame{
    
    Color newC;    // Set all lables text areas and varables
    
    JButton changeC;
    
    JLabel Red;
    JLabel Green;
    JLabel Blue;
    
    JTextField textfieldRed;    
    JTextField textfieldBlue;    
    JTextField textfieldGreen;
    
    JPanel buttonPanel;
    JPanel colourPanel;
    
    private int count;
    
    ColourChanger(){

    initComponents();
}
    
    
    //Create all gui components
    public void initComponents(){
        setLayout(new FlowLayout());
        
        
        // Set up panels
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        
        
        colourPanel = new JPanel();
        colourPanel.setLayout(new FlowLayout());
        colourPanel.setPreferredSize(new Dimension(400,200));
        
        
        
        //Add button Action Listeners
        changeC =new JButton("Change Colour");
                
        changeC.addActionListener(ev -> {       
            ChangeColourFunction();
        });
        
        //Add buttons to Panels
        buttonPanel.add(changeC);
        add(buttonPanel);
        
        

        //Add text fields for user to input colours
         textfieldRed = new JTextField("0");
        textfieldRed.setPreferredSize(new Dimension(50,20));
        
         textfieldBlue = new JTextField("0");
        textfieldBlue.setPreferredSize(new Dimension(50,20));
        
         textfieldGreen = new JTextField("0");
        textfieldGreen.setPreferredSize(new Dimension(50,20));
        
        
        // Add Jlables for txtfields 
         Red = new JLabel("Red:");
        Red.setPreferredSize(new Dimension(30,20));
        
         Blue = new JLabel("Blue:");
        Blue.setPreferredSize(new Dimension(32,20));
        
         Green = new JLabel("Green:");
        Green.setPreferredSize(new Dimension(40,20));
        
        
        //Add to panels in order you want because we are using flow layout
        colourPanel.add(Red);
        colourPanel.add(textfieldRed);
        colourPanel.add(Blue);
        colourPanel.add(textfieldBlue);
        colourPanel.add(Green);
        colourPanel.add(textfieldGreen);
        
        add(colourPanel);
        
        //Pack makes GUI look nicer 
        pack();   
    }
    
    
    
    //Function 
    private void ChangeColourFunction() {
        
        int txtRedinput = Integer.parseInt(textfieldRed.getText()) ;
        int txtBlueinput = Integer.parseInt(textfieldBlue.getText()) ;
        int txtGreeninput = Integer.parseInt(textfieldGreen.getText()) ;
        
        newC = new Color(txtRedinput,txtGreeninput,txtBlueinput);
        System.out.println(txtRedinput + txtGreeninput + txtBlueinput);
       
        colourPanel.setBackground(newC); //Colour panel changes background
    }
    
    
    
    //Have to have a start to run program
    public static void main(String[] args){
        new ColourChanger().setVisible(true);
    }


    
}
    

