import java.util.Scanner;

public class factorial {
    static int fact = 1;

    static void factorialofn(int n) {
        if (n <= 0) {
            return;
        }
        fact = fact * n;
        factorialofn(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        factorialofn(n);
        System.out.println(fact);
        sc.close();
    }

}