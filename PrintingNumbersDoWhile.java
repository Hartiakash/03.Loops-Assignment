package Loops_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_loops.html
 *
 * 7. Write a program to print 1 to 10 using the do-while loop statement.
 */

/* The Java do-while loop is used to iterate a part of
    the program repeatedly, until the specified condition is true. */
public class PrintingNumbersDoWhile {
    public static void main(String[] args) {

        int i = 1;
        /* The Java do-while loop is executed at least once because
        condition is checked after loop body. */
        do {
            System.out.print(i + " ");
            i++;
        }
        /* Therefore, unlike while loop and for loop, the do-while
        checks the condition at the end of loop body */
        while (i <= 10);
    }
}