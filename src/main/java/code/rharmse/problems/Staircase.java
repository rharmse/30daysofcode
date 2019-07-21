package code.rharmse.problems;

import java.util.Scanner;

public class Staircase {

  // Complete the staircase function below.
  static void staircase(int n) {
    for (int x = 1; x <= n; x++) {
      for (int ws = (n-x); ws > 0; ws--) {
        System.out.printf("%s"," ");
      }
      for (int br = x; br > 0; br--) {
        System.out.printf("%s", "#");
      }
      System.out.println();
    }
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      staircase(n);

      scanner.close();
  }
}