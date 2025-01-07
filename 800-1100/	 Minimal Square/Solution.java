import java.util.Scanner;

public class CoinDistribution {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Number of test cases
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                b = b * 2;
                if (b >= a) {
                    System.out.println(b*b);
                } else {
                    System.out.println(a*a);
                }
            }
            else if (b > a) {
                a = a * 2;
                if (a >= b) {
                    System.out.println(a*a);
                } else {
                    System.out.println(b*b);
                }
                
            } else {
                a = a * 2;
                System.out.println(a*a);
            }
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
