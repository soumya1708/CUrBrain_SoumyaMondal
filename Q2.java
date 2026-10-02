import java.util.Scanner;
public class Q2{
    public static int  reverse_and_double(int n){
        int t;
        if(n<0){
            t=-2;
        }
        else{
            t=2;
        }
        n=Math.abs(n);
        int s=0;
        while(n>0){
            int b=n%10;
            s=s*10+b;
            n=n/10;
        }
        return t*s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print(reverse_and_double(a));
    }
}
