import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int k = sc.nextInt();
                int x = sc.nextInt();
                
                // The smallest n where no valid string exists is 
                // when the first 'cycle' (1, 1+x, 1+2x...) 
                // requires a (k+1)-th distinct character.
                long result = 1L + (long) k * x;
                
                System.out.println(result);
            }
        }
        sc.close();
    }
}
