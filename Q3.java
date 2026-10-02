import java.util.Scanner;
public class Q3{
    public static int palindrome_add(int n){
        int t=1;
        int b=n;
        if(n<0) {
            t=-1;
            n=Math.abs(n);
        }
        int s=0;
        while(n>0){
            int c=n%10;
            s=s*10+c;
            n=n/10;
        }
        s=s*t;
        if(b>=0 && b==s){
            return b;
        }
        return s+b;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        System.out.print(palindrome_add(a));
    }
}