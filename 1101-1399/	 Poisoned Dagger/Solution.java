import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long h = sc.nextLong();
            long[] v = new long[n];
            
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }
            
            long low = 1, high = h;
            
            while (low <= high) {
                long mid = low + (high - low) / 2;
                long damage = mid;
                
                for (int i = 0; i < n - 1; i++) {
                    damage += Math.min(mid, v[i + 1] - v[i]);
                }
                
                if (damage >= h) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            
            System.out.println(low);
        }
        
        sc.close();
    }
}
