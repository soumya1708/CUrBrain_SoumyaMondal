import java.util.Scanner;
public class Q6{
    public static int digitFrequencyDifference(int n,int a,int b) {
        int countA=0;
        int countB=0;
        if (n==0){
            if (a==0){
                countA++;
            }
            if (b==0){
                countB++;
            }
        } else{
            while (n>0){
                int digit=n%10;
                if (digit==a){
                    countA++;
                }
                if (digit==b) {
                    countB++;
                }
                n/=10;
            }
        }
        return Math.abs(countA-countB);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.println(digitFrequencyDifference(n, a, b));
    }
}