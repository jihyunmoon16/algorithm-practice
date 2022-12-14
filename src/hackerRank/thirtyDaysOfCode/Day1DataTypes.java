package hackerRank.thirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author 문지현
 * @version 1.0
 * @since 2022-12-14
 */
public class Day1DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int secondI;
        double secondD;
        String secondS;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        secondI = scan.nextInt();
        scan.nextLine();                // 버퍼 비워주기
        secondD = scan.nextDouble();
        scan.nextLine();                // 버퍼 비워주기
        secondS = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secondI);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + secondD);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + secondS);

        scan.close();
    }

}
