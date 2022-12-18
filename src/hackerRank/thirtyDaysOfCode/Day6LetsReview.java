package hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

public class Day6LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        int numOfTestCases = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < numOfTestCases; i++) {
            String S = scan.nextLine();
            char[] arr = S.toCharArray();           // string을 char 타입의 배열로 바꾸기 위해 toCharArray() 메소드 사용
            for(int j = 0; j < arr.length; j++) {
                if(j % 2 == 0) {
                    System.out.print(arr[j]);
                }
            }
            System.out.print(" ");
            for(int k = 0; k < arr.length; k++) {
                if(k % 2 != 0) {
                    System.out.print(arr[k]);
                }
            }
            System.out.println();
        }
    }
}
