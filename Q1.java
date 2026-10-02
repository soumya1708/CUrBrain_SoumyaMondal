import java.util.Scanner;
public class Q1 {
    public static boolean evenDigits(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return false;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print(evenDigits(a));
    }
}