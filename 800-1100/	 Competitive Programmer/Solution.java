import java.util.Scanner;

public class CompetitiveProgrammer {

    // Method to check if a number can be rearranged to be divisible by 60
    private static String isRed(String number) {
        boolean hasZero = false;
        int evenCount = 0;
        int digitSum = 0;

        // Analyze the digits
        for (char ch : number.toCharArray()) {
            int digit = ch - '0';
            digitSum += digit;
            if (digit == 0) {
                hasZero = true;
            } else if (digit % 2 == 0) {
                evenCount++;
            }
        }

        // Check conditions for divisibility by 60
        if (hasZero && (evenCount > 0 || number.chars().filter(ch -> ch == '0').count() > 1) && digitSum % 3 == 0) {
            return "red";
        } else {
            return "cyan";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of test cases
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Process each number
        for (int i = 0; i < n; i++) {
            String number = sc.nextLine().trim();
            System.out.println(isRed(number));
        }

        sc.close();
    }
}
