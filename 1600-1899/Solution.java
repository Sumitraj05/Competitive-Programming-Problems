import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input string
        String s = sc.next();
        
        // Read available ingredients
        long b1 = sc.nextLong(), b2 = sc.nextLong(), b3 = sc.nextLong();
        
        // Read prices of ingredients
        long p1 = sc.nextLong(), p2 = sc.nextLong(), p3 = sc.nextLong();
        
        // Read available money
        long r = sc.nextLong();
        
        // Count occurrences of 'B', 'S', and 'C'
        long a = 0, b = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'B') a++;
            else if (ch == 'S') b++;
            else if (ch == 'C') c++;
        }

        // Binary search for maximum hamburgers
        long low = 0, high = r + 200;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            // Calculate required extra ingredients
            long r1 = Math.max(a * mid - b1, 0);
            long r2 = Math.max(b * mid - b2, 0);
            long r3 = Math.max(c * mid - b3, 0);
            
            // Calculate total price
            long price = r1 * p1 + r2 * p2 + r3 * p3;

            // Binary search condition
            if (price <= r) 
                low = mid + 1;
            else 
                high = mid - 1;
        }

        // Print the maximum number of hamburgers that can be made
        System.out.println(high);
        
        sc.close();
    }
}
