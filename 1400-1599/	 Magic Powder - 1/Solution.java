import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a1 = new int[n];
        int[] b1 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            b1[i] = sc.nextInt();
            min = Math.min(min, b1[i]);
        }
        int low = 0;
        int high = k + min;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.max(mid * a1[i] - b1[i], 0);
            }
            if (sum <= k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(high);
        
        sc.close();
    }
}
