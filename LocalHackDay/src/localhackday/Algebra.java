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
public class Algebra {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int input = (int)((Math.random()*5) +1);
    if (input == 1){
        System.out.println("You will have 3 attempts the solve the problem correctly. After the third failed attempt, the correct answer will be shown.");
        System.out.println("f(x)=(4x)^2 - 3x");
        System.out.print("f(-1)= ");
        int attempt = sc.nextInt();
        int counter = 3;
        while(counter > 0){
            if (attempt == 13){
                System.out.println("Correct! ");
                break;
            }
            else {
                System.out.print("Incorrect " + (counter-1) + " tries remaining.");
                counter--;
                attempt = sc.nextInt();
            }
        }
        System.out.print("f(-1) = 13");
    }
    if (input == 2){
        System.out.println("You will have 3 attempts the solve the problem correctly. After the third failed attempt, the correct answer will be shown.");
        System.out.println("g(x)=3(x^2 + 1)/6");
        System.out.print("g(3)= ");
        int attempt = sc.nextInt();
        int counter = 3;
        while(counter > 0){
            if (attempt == 5){
                System.out.println("Correct! ");
                break;
            }
            else {
                System.out.print("Incorrect " + (counter-1) + " tries remaining.");
                counter--;
                attempt = sc.nextInt();
            }
        }
        System.out.print("g(3) = 5");
    }
    if (input == 3){
        System.out.println("You will have 3 attempts the solve the problem correctly. After the third failed attempt, the correct answer will be shown.");
        System.out.println("if f(x)=x^2 - 3x and g(x)=6(x^2 + 1)/3");
        System.out.print("g(f(3))= ");
        int attempt = sc.nextInt();
        int counter = 3;
        while (counter > 0){
            if (attempt == 2){
                System.out.print("Correct! ");
                break;
                }
            else{
                System.out.print("Incorrect " + (counter-1) + " tries remaining.");
                counter--;
                attempt = sc.nextInt();
            }
        }
        System.out.print("g(f(x)) = 2");
    }
    if (input == 4){
        System.out.println("You will have 3 attempts the solve the problem correctly. After the third failed attempt, the correct answer will be shown.");
        System.out.println("log(100)= ");
        int attempt = sc.nextInt();
        int counter = 3;
        while(counter > 0){
            if (attempt == 2){
                System.out.print("Correct! ");
                break;
            }
            else{
                System.out.print("Incorrect " + (counter-1) + " tries remaining.");
                counter--;
                attempt = sc.nextInt();
            }
        }
        System.out.print("log(100) = 2");
    }
    if (input == 5){
        System.out.println("You will have 3 attempts the solve the problem correctly. After the third failed attempt, the correct answer will be shown.");
        System.out.println("What is the slope of 12x - 4y = 4");
        System.out.print("Slope= ");
        int attempt = sc.nextInt();
        int counter = 3;
        while(counter > 0){
            if (attempt == 3){
                System.out.print("Correct! ");
                break;
            }
            else{
                System.out.print("Incorrect " + (counter-1) + " tries remaining.");
                counter--;
                attempt = sc.nextInt();
            }
        }
        System.out.print("Slope = 3");
        }
    }
}
