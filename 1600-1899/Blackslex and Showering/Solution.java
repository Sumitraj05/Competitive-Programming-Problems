import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long totalDistance = 0;
            for (int i = 0; i < n - 1; i++) {
                totalDistance += Math.abs(a[i] - a[i + 1]);
            }

            long maxReduction = Math.abs(a[0] - a[1]);
            maxReduction = Math.max(maxReduction, Math.abs(a[n - 2] - a[n - 1]));
            for (int k = 1; k < n - 1; k++) {
                long currentReduction = (long) Math.abs(a[k - 1] - a[k]) 
                                      + Math.abs(a[k] - a[k + 1]) 
                                      - Math.abs(a[k - 1] - a[k + 1]);
                maxReduction = Math.max(maxReduction, currentReduction);
            }
            System.out.println(totalDistance - maxReduction);
        }
        sc.close();
    }
}
