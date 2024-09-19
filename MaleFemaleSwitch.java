package Loops_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_loops.html
 *
 * 12. Print gender (Male/Female) program according to given M/F using switch.
 */

import java.util.Scanner;

public class MaleFemaleSwitch {
    public static void main(String[] args) {

        System.out.print("Enter a Character (M/F)  : ");
        Scanner sc = new Scanner(System.in);
        //The Java String class "charAt()" method returns a char value at the given index number.
        char Gender = sc.next().charAt(0);
        //The Java switch statement executes one statement from multiple conditions.
        switch (Gender) {
            //The case values must be unique. In case of duplicate value, it renders compile-time error.
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
        }
    }
}
