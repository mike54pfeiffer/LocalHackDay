/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localhackday;

/**
 *
 * @author Admin
 */

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;
import java.awt.event.ActionListener;

public class MathReviewHome extends JFrame implements ActionListener
{


JPanel homePagePanel = new JPanel();
JLabel headerLabel = new JLabel("Math review questions");
JLabel promptLabel = new JLabel("Please select a math subject down below");
String [] mathSubjectList = {"Select a math subject","Algebra", "Calculus", "Geometry", "Pre-Algebra", "Pre-Calculus" , "Trigonometry"};
JComboBox mathSubjectComboBox = new JComboBox(mathSubjectList);
JButton goButton = new JButton("Go!");



public static void main(String [] args)
{
MathReviewHome reviewApp = new MathReviewHome();
reviewApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

 public MathReviewHome()
{
    homePagePanel.add(headerLabel);
    homePagePanel.add(promptLabel);
    homePagePanel.add(mathSubjectComboBox);
    homePagePanel.add(goButton);
    mathSubjectComboBox.setSelectedIndex(0);
    add(homePagePanel);
    setSize(500,150);
    setVisible(true);
    addActionListeners();
}
    
 public void addActionListeners()
 {
     goButton.addActionListener(this);
 }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()== goButton)
            changePage();
    }
     
    
    public void changePage()
    {
        
    }
 }
 

