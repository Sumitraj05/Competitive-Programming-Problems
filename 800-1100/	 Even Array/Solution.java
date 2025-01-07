import java.util.Scanner;

public class CoinDistribution {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Number of test cases
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int odd = 0;
            int even = 0;
            for (int i = 0; i < a; i++) {
                int val = sc.nextInt();
                if (val % 2 != i % 2) {
                    if (val % 2 != 0) {
                        odd++;
                    } else {
                        even++;
                    }
                }
            }
            if (odd == even) {
                System.out.println(odd);
            } else {
                System.out.println(-1);
            }
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
