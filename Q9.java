import java.util.Scanner;
public class Q9{
    public static int immprime(int a){
        int i=a+1;
        while(true){
            boolean prime=true;
            if(i<2){
                prime=false;
            }
            else{
                int j=2;
                while(j*j<=i) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                    j++;
                }
            }
            if(prime){
                return i;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Prime number greater :" + immprime(n));
    }
}