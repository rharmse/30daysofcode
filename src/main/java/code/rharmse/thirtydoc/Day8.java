package code.rharmse.thirtydoc;

import java.io.IOException;
import java.util.Scanner;

public class Day8 {

    // Complete the factorial function below.
    static int factorial(int n) {
        return n * (n > 1 ? factorial (n-1) : 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.println(result);

        scanner.close();
    }
}
