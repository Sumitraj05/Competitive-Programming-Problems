import java.util.Scanner;

public class CoinDistribution {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Number of test cases
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            
            // Total coins after distribution
            int totalCoins = a + b + c + n;
            
            // Check if divisible by 3
            if (totalCoins % 3 != 0) {
                System.out.println("NO");
                continue;
            }
            
            // Calculate target coins for each sister
            int target = totalCoins / 3;
            
            // Check if distribution is valid
            if (target >= a && target >= b && target >= c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
