import java.util.*;

public class Main {
    public static long can(long cap) {
        long ret = 0;
        for (long k = 2; k * k * k <= cap; k++) { // Iterate while k³ ≤ cap
            ret += (cap / (k * k * k));
            if (ret > 1_000_000_000_000_000L) // Prevent unnecessary calculations
                return ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        long low = 0;
        long high = 5_000_000_000_000_000L; // Increased upper bound
        long ans = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long ret = can(mid);

            if (ret == n) {
                ans = mid;
                high = mid - 1; // Find the smallest valid `n`
            }

            if (ret >= n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
