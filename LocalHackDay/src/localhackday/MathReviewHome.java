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
String [] mathSubjectList = {"Select a math subject","Algebra", "Calculus", "Pre-Calculus" , "Trigonometry"};
JComboBox mathSubjectComboBox = new JComboBox(mathSubjectList);
JButton goButton = new JButton("Go!");
JButton backButton = new JButton("back");
JButton clearButton = new JButton("clear");
JButton submitButton= new JButton("submit answer");
JTextArea questionTextArea = new JTextArea(10,60);
JTextField inputTextField = new JTextField(20);
JTextField resultTextField = new JTextField(30);


Algebra algebraQuestions = new Algebra();
Calc calculusQuestions = new Calc();
PreCalc preCalculusQuestions = new PreCalc();
Trig trigQuestions = new Trig();

//Main method
public static void main(String [] args)
{
MathReviewHome reviewApp = new MathReviewHome();
reviewApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

//Constructor
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
     submitButton.addActionListener(this);
     inputTextField.addActionListener(this);
 }

 //This method checks if the user has selected a math subject before checking which button had caused the action to occur
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
        {
            clearText();
            inputTextField.requestFocus();
        }
        
        else if(e.getSource() == submitButton)
             submitAnswer();
        
        else if(e.getSource() == inputTextField)
            submitAnswer();
         
         }
         else
         {
             JOptionPane.showMessageDialog(rootPane, "Please select a math subject");
             mathSubjectComboBox.requestFocus();
         }
        
         
    }
     
    //This method opens up the home page and closes the math page
    public void openHomePage() 
    {
        mathSubjectComboBox.setSelectedIndex(0);
        remove(mathPanel);
        add(homePagePanel);
        setSize(500,150);
        mathPanel.setVisible(false);
        homePagePanel.setVisible(true);
        clearText();
    }

    //This method opens up the math page and closes the home page
    public void openMathPage() 
    {
        remove(homePagePanel);
        add(mathPanel);
        mathPanel.setVisible(true);
        questionTextArea.setVisible(true);
        homePagePanel.setVisible(false);
        setSize(600,400);
        selectMathSubject();
    }
    
    //This method will clear the input text field
    public void clearText()
    {
        inputTextField.setText("");
        questionTextArea.setText("");
    }

    //This method will occur when the submit button is clicked. It will check for any user input in the 
    //input text area. If the user has put input, the program will then send the answer to the proper class.
    public void submitAnswer() 
    {
        int textSize = inputTextField.getSize().width;
     if(textSize == 0)
     {
         JOptionPane.showMessageDialog(rootPane, "Please enter your answer");
         inputTextField.requestFocus();
     }
     
     else
     {
         clearText();
         if(mathSubjectComboBox.getSelectedIndex() == 1)
         {
             
         }
             
         if(mathSubjectComboBox.getSelectedIndex() == 2)
         {
             
         }
             
         if(mathSubjectComboBox.getSelectedIndex() == 3)
         {
             
         }
                 
         if(mathSubjectComboBox.getSelectedIndex() == 4)
         {
             
         }
         
     }
    }

//this method will check which subject was selected and then call the class from the selected subjct.
    //The proper will then send back a random question to display on the text area.
      public void selectMathSubject()
      {
        
           if(mathSubjectComboBox.getSelectedIndex() == 1)
         {
             String question = algebraQuestions.getQuestion();
             questionTextArea.setText(question);
         }
             
         if(mathSubjectComboBox.getSelectedIndex() == 2)
         {
             
         }
             
         if(mathSubjectComboBox.getSelectedIndex() == 3)
         {
             
         }
                 
         if(mathSubjectComboBox.getSelectedIndex() == 4)
         {
             
         }

      }
   
 }
 

