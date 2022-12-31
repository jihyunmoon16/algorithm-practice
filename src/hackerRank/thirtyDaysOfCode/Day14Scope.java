package hackerRank.thirtyDaysOfCode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] a) {
        this.elements = a;
    }
    public void computeDifference() {
        int maxNum = elements[0];
        int minNum = maxNum;

        // 최소값과 최대값을 찾은 다음에 그 둘의 절대값 차이? 를 찾으면 됨
        for(int i = 1; i < elements.length; i++) {
            maxNum=elements[i]>maxNum?elements[i]:maxNum;
            minNum=elements[i]>minNum?minNum:elements[i];
        }

        maximumDifference = Math.abs(maxNum - minNum);
    }

} // End of Difference class

public class Day14Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}