import java.util.Scanner;

import java.util.*;

public class Solution {
    // Method to calculate the GCD (Greatest Common Divisor) of two numbers
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            String s1 = sc.next(); // First string
            String s2 = sc.next(); // Second string

            long n1 = s1.length(); // Length of the first string
            long n2 = s2.length(); // Length of the second string

            // Calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
            long lcm = (n1 * n2) / gcd(n1, n2);

            StringBuilder r1 = new StringBuilder();
            StringBuilder r2 = new StringBuilder();

            // Build the repeated strings for s1 and s2 based on the LCM
            for (int i = 0; i < lcm / n1; i++) {
                r1.append(s1);
            }
            for (int i = 0; i < lcm / n2; i++) {
                r2.append(s2);
            }

            // Check if the two repeated strings are equal
            if (r1.toString().equals(r2.toString())) {
                System.out.println(r1);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
 
