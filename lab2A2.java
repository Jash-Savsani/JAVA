import java.util.Scanner;

public class lab2A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.print("Enter a First Number:");
        int a = sc.nextInt();
        System.out.print("Enter a Second Number:");
        int b = sc.nextInt();
        System.out.print("Enter a Operation from '+' or '-' or '*' or '/' or '%':");
        String s = sc.next();
        if(s.equals("+")) {
            System.out.print("Result:" + a + "+" + b + "=" + (a + b));
        } else if (s.equals("-")) {
            System.out.print("Result:" + a + "-" + b + "=" + (a - b));
        } else if (s.equals("*")) {
            System.out.print("Result:" + a + "*" + b + "=" + (a * b));
        } else if (s.equals("/")) {
            System.out.print("Result:" + a + "/" + b + "=" + (a / b));
        } else if (s.equals("%")) {
            System.out.print("Result:" + a + "%" + b + "=" + (a % b));
        } else {
            System.out.println("Invalid Symbol.");
        }
    }
}
