/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localhackday;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Trig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tric = (int)(Math.random()*5 +1);
        if(tric == 1){
            System.out.println("Find the exact value");
            System.out.println("sec*(π/4)");
            String attempt = sc.nextLine();
            int counter = 3;
            while(counter > 0){    
                if(attempt.equals("sqrt(2)")){
                    System.out.println("Correct!!");
                    break;
                }
                else{
                System.out.println("Incorrect><");
                counter--;
                attempt = sc.nextLine();
                }
            }
            System.out.print("The answer is sqrt(2)");
        }
        if(tric == 2){
            System.out.println("Find the exact valueof the expression if X=45degree");
            System.out.println("f(X)=cosX");
            System.out.println("Find [f(X)]^2");
            String attempt = sc.nextLine();
            int counter = 3;
            while(counter > 0){
                if(attempt.equals("1/2")){
                    System.out.println("Correct!!");
                }
                else{
                    System.out.println("Incorrect><");  
                }
            }
            System.out.println("The answer is 1/2");
        }
        if(tric == 3){
            System.out.println("Find the exact value of the expression");
            System.out.println("sec 60 degree-cos 45 degree)");
            String attempt = sc.nextLine();
            int counter = 3;
            while(counter > 0){
                if(attempt.equals("(4-sqrt(2))/2")){
                    System.out.println("Correct!!");
                }
                else{
                    System.out.println("Incorrect><");
            
                }    
            }    
            System.out.println("The answer is (4-sqrt(2))/2");
        }
        if(tric == 4){
            System.out.println("Find the exact value of the expression");
            System.out.println("cos(π/3)-tan((5π/3)");
            String attempt = sc.nextLine();
            int counter = 3;
            while(counter > 0){
                if(attempt.equals("(1-2*sqrt(3))/2")){
                    System.out.println("Correct!!");
                }
                else{
                    System.out.println("Incorrect><");
                }    
            }
            System.out.println("The answer is ((1-2*sqrt(3))/2)");
        }
    }
}
