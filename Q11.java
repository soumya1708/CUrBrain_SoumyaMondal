```java
import java.util.Scanner;

public class Q11 {

    static final long MOD = 1_000_000_007L;

    public static long modularAddition(long[] arr) {
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = (sum + arr[i] % MOD) % MOD;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println(modularAddition(arr));

        sc.close();
    }
}
```