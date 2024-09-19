package Loops_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_loops.html
 *
 * 11. Program to check whether a number is EVEN or ODD using switch
 */

import java.util.Scanner;

public class EvenOrOddNumberSwitch {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number : ");
        //user input stored in n
        n = new Scanner(System.in).nextInt();

        //The Java switch statement executes one statement from multiple conditions.
        //The case values must be unique. In case of duplicate value, it renders compile-time error.
        switch (n % 2) {
            //Even number has a remainder of 0 if divided by 2
            case 0:
                System.out.println(n + " is an Even Number");
                break;
            //Odd number has a remainder of 1 if divided by 2
            case 1:
                System.out.println(n + " is an Odd Number");
                break;
        }
    }
}
