package hackerRank.thirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16ExceptionsStringToInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();
        int i = 0;

        try {
            i = Integer.parseInt(S);
            System.out.println(i);
        } catch(NumberFormatException e) {
            System.out.println("Bad String");
        }
    }

}
