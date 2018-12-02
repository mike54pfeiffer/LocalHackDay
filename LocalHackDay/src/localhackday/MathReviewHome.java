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
JPanel mathPanel = new JPanel();
JLabel headerLabel = new JLabel("Math review questions");
JLabel promptLabel = new JLabel("Please select a math subject down below");
String [] mathSubjectList = {"Select a math subject","Algebra", "Calculus", "Geometry", "Pre-Algebra", "Pre-Calculus" , "Trigonometry"};
JComboBox mathSubjectComboBox = new JComboBox(mathSubjectList);
JButton goButton = new JButton("Go!");
JButton backButton = new JButton("back");
JButton clearButton = new JButton("clear");
JButton submitButton= new JButton("submit answer");
JTextArea questionTextArea = new JTextArea(10,60);
JTextField inputTextField = new JTextField(20);
JTextField resultTextField = new JTextField(30);


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
    mathPanel.add(questionTextArea);
    mathPanel.add(inputTextField);
    mathPanel.add(clearButton);
    mathPanel.add(submitButton);
    mathPanel.add(backButton);
    mathSubjectComboBox.setSelectedIndex(0);
    add(homePagePanel);
    mathPanel.setVisible(false);
    setSize(500,150);
    setVisible(true);
    addActionListeners();
}
    
 public void addActionListeners()
 {
     goButton.addActionListener(this);
     backButton.addActionListener(this);
     clearButton.addActionListener(this);
 }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if(mathSubjectComboBox.getSelectedIndex()!=0)
         {
        if(e.getSource()== goButton)
        {
            openMathPage();
            clearText();
        }
        
        else if(e.getSource() == backButton)
        {
            openHomePage();
            clearText();
        }
        
        else if(e.getSource() == clearButton)
            clearText();
         }
         else
         {
             JOptionPane.showMessageDialog(rootPane, "Please select a math subject");
             mathSubjectComboBox.requestFocus();
         }
    }
     
    
    public void openHomePage() 
    {
        remove(mathPanel);
        add(homePagePanel);
        setSize(500,150);
        mathPanel.setVisible(false);
        homePagePanel.setVisible(true);
        clearText();
    }

    public void openMathPage() 
    {
        remove(homePagePanel);
        add(mathPanel);
        mathPanel.setVisible(true);
        questionTextArea.setVisible(true);
        homePagePanel.setVisible(false);
        setSize(600,600);
    }
    
    public void clearText()
    {
        inputTextField.setText("");
    }


      
   
 }
 

