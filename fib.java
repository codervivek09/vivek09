import java.util.*;

public class fib {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    int c = 2;
        
        while (c <= n){
            int temp = b;
            b= a + b;
            a = temp ;
            c++;
           
        }
        System.out.println(b);

    }
}