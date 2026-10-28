import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q17 {

    public static int mostPopularItem(int[] sales) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int id : sales) {
            frequency.put(id, frequency.getOrDefault(id, 0) + 1);
        }

        int mostPopular = sales[0];
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int id = entry.getKey();
            int count = entry.getValue();

            if (count > maxFrequency ||
                    (count == maxFrequency && id < mostPopular)) {
                maxFrequency = count;
                mostPopular = id;
            }
        }

        return mostPopular;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sales = new int[n];

        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        System.out.println(mostPopularItem(sales));

        sc.close();
    }
}
