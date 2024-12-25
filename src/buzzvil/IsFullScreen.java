package buzzvil;

import java.io.*;


public class IsFullScreen {
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            System.out.printf("%" + n + "s%n", "#".repeat(i));
        }
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        IsFullScreen.staircase(n);

        bufferedReader.close();
    }
}

