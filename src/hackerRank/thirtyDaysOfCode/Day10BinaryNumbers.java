package hackerRank.thirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // TODO 다시 풀기 테스트 코드 확인 필요
        // 439를 넣었을 때 3이 나와야 함
        // 65535를 넣었을 때 16이 나와야 함
    }
}


/*
    첫 번째 시도. 테스트 2개 통과 못함....
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int countConsecutiveNum = 0;

        String binaryNum = Integer.toBinaryString(n);  // 10진수를 2진수로 바꿔줌.

        bufferedReader.close();

        char[] arr = binaryNum.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]== '1') {
                countConsecutiveNum++;
            } else {
                System.out.println(countConsecutiveNum);
                break;
            }
        }
    }
 */
