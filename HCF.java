import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int hcf = findHCF(a, b);
        System.out.println("The HCF of " + a + " and " + b + " is " + hcf);
    }

    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findHCF(b, a % b);
        }
    }
}
