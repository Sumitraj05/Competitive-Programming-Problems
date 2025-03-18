import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Use BufferedReader for fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        // Read the number of test cases
        int t = Integer.parseInt(br.readLine());

        // Process each test case
        while (t-- > 0) {
            // Read a1 and K for this test case
            String[] input = br.readLine().split(" ");
            long a1 = Long.parseLong(input[0]);
            long K = Long.parseLong(input[1]);

            // Compute aK
            long current = a1;
            for (long i = 1; i < K; i++) {
                long minDigit = getMinDigit(current);
                long maxDigit = getMaxDigit(current);

                // If minDigit becomes 0, the sequence will not change further
                if (minDigit == 0) {
                    break;
                }
                current += minDigit * maxDigit;
            }

            // Append the result for this test case
            result.append(current).append("\n");
        }

        // Print all results
        System.out.print(result.toString());
    }

    // Function to get the minimum digit in a number
    private static long getMinDigit(long num) {
        long minDigit = 9;
        while (num > 0) {
            minDigit = Math.min(minDigit, num % 10);
            num /= 10;
        }
        return minDigit;
    }

    // Function to get the maximum digit in a number
    private static long getMaxDigit(long num) {
        long maxDigit = 0;
        while (num > 0) {
            maxDigit = Math.max(maxDigit, num % 10);
            num /= 10;
        }
        return maxDigit;
    }
}
