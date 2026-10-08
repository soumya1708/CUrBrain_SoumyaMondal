import java.util.Scanner;
public class Q10{
    public static int countPrimes(int n){
        if (n<=2){
            return 0;
        }
        boolean[] isPrime=new boolean[n];
        for (int i=2;i<n;i++){
            isPrime[i]=true;
        }
        for (int i=2;i*i<n;i++){
            if (isPrime[i]){
                for (int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for (int i=2;i<n;i++){
            if (isPrime[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Number of primes strictly less than " +n+ " = " + countPrimes(n));
        sc.close();
    }
}