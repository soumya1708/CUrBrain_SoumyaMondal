import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14 {

    public static List<Integer> thresholdFilter(int[] sales, int threshold) {
        List<Integer> result = new ArrayList<>();

        for (int sale : sales) {
            if (sale >= threshold) {
                result.add(sale);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] sales = new int[n];

        System.out.println("Enter sales figures:");
        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        System.out.println(thresholdFilter(sales, threshold));

        sc.close();
    }
}