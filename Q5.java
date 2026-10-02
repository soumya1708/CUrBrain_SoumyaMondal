import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Q5{
    public static List<Integer> replaceEven(int n){
        List<Integer> result=new ArrayList<>();
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                result.add(0);
            }
            else{
                result.add(digit);
            }
            n/=10;
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        System.out.print(replaceEven(a));
    }
}