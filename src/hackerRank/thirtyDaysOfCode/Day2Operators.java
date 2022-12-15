package hackerRank.thirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 문지현
 * @version 1.0
 * @since 2022-12-15
 */
class Day2Operators {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = ((double)tip_percent/100) * meal_cost;
        double tax = ((double)tax_percent/100) * meal_cost;
        int total_cost = (int)Math.round(meal_cost + tip + tax);

        System.out.println(total_cost);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Day2Operators.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}