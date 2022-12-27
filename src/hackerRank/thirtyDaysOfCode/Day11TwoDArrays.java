package hackerRank.thirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day11TwoDArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // <List<List<Integer>>를 2D Array로 변환
        int[][] changedArr = arr.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<=3; i++) {
            for(int j=0; j<=3; j++) {
                int sum = changedArr[i][j]   + changedArr[i][j+1]   + changedArr[i][j+2] +
                        changedArr[i+1][j+1] +
                        changedArr[i+2][j] + changedArr[i+2][j+1] + changedArr[i+2][j+2];
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);

        bufferedReader.close();
    }

    // <List<List<Integer>> 이걸 그냥 사용해서 문제를 풀 수 있는 방법이 있을 것 같은데 잘 모르겠다.
}
