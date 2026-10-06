import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Q8 {
    public static int factor_of_n(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }
        Collections.sort(factors);
        if (k <= factors.size()) {
            return factors.get(k - 1);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println(factor_of_n(n, k));
        sc.close();
    }
}