import java.util.Scanner;
public class Q4{
    public static int product_sum(int n){
        int s=0;
        int p=1;
        while(n>0){
            int b=n%10;
            s+=b;
            p=p*b;
            n=n/10;
        }
        return p-s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        System.out.print(product_sum(a));
    }
}