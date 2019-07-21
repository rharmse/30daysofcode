package code.rharmse.thirtydoc;

import java.util.Scanner;

class Day6 {
  private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        for (int i = arr.length; i > 0; i--) {
          System.out.printf("%d ", arr[i-1]);
        }
        System.out.println();
        scanner.close();
    }
}