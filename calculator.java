import java.util.*;

public class calculator {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Two Numbers : ");
int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans ;
        System.out.println("Enter A Operation (+,-,*,/,%): ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+'-> System.out.println(ans = num1 + num2);
            case '-'-> System.out.println(ans = num1 - num2);
            case '*' -> System.out.println(ans = num1 * num2);
            case '/' -> System.out.println(ans = num1 / num2);
            case '%' -> System.out.println(ans = num1 % num2);
              }

        sc.close();

    }
}

    