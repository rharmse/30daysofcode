package code.rharmse.thirtydoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1 {
    public static void main(String...args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String data = reader.readLine();
            System.out.printf("%s\n%s", "Hello, World.", data);           
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}