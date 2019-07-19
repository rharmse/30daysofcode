package code.rharmse.thirtydoc;

import java.util.Scanner;

public class Day5 {

  final static Scanner SCANNER = new Scanner(System.in);

  static String[] splitOddEven(String data) {
    String[] splitData = new String[2];
    char[] dataArr = data.toCharArray();
    StringBuilder even = new StringBuilder();
    StringBuilder odd = new StringBuilder();
    
    for (int ix = 0; ix < dataArr.length; ix++) {      
      if (ix % 2 == 0) {
        even.append(dataArr[ix]);
      } else {
        odd.append(dataArr[ix]);
      }
    }
    splitData[0] = even.toString();
    splitData[1] = odd.toString();
    return splitData;
  }

  public static void main(String...args) {
    
    int linesCnt = 0;
    if (SCANNER.hasNextInt()) {
      linesCnt = SCANNER.nextInt();
      SCANNER.nextLine();     // clear trailing \r\n
    }

    if (linesCnt > 0) {
      
      String[] lines = new String[linesCnt];
      for (int i = 0; i < linesCnt; i++) {
        lines[i] = SCANNER.nextLine();
      }

      for (int i = 0; i < linesCnt; i++) {
        String[] data = splitOddEven(lines[i]);
        System.out.printf("%s %s\n", data[0],data[1]);
      }
    }

    SCANNER.close();
  }
}