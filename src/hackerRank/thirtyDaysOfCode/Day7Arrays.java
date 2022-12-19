package hackerRank.thirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day7Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt) // :: method reference
                .collect(toList()); // returns the results of the operations as a List

        bufferedReader.close();

        Collections.reverse(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
