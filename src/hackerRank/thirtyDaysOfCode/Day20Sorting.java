package hackerRank.thirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class Day20Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int numberOfSwaps = 0;
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-1; j++) {
                if (a.get(j) > a.get(j+1)) {
                    // add가 아니라 set을 써야함
                    int tmp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, tmp);
                    // Collections.swap(a, j, j+1);
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n-1));

        bufferedReader.close();
    }
}
