package code.rharmse.thirtydoc;

import java.util.Scanner;

public class Day2 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int readInt = 0;
        double readDouble = 0.0d;
        String readStr = "";

        /* Read and save an integer, double, and String to your variables.*/
        readInt = scan.hasNextInt() ? i + scan.nextInt() : 0;
        readDouble = scan.hasNextDouble() ? d + scan.nextDouble() : 0.0d;
        scan.nextLine();
        readStr = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(readInt);
        /* Print the sum of the double variables on a new line. */
        System.out.printf("%.1f\n", readDouble);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+readStr);
        scan.close();
    }
}