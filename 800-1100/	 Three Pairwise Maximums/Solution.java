import java.util.Scanner;

public class CPlusEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int x = sc.nextInt(); // Number of elements in the array
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x == y && x >= z) {
                int a = x;
                int b = z;
                int c = z;
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else if (y == z && y >= x) {
                int a = y;
                int b = x;
                int c = x;
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else if (x == z && z >= y) {
                int a = z;
                int b = y;
                int c = y;
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
