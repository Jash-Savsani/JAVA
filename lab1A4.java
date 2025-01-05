import java.util.Scanner;

public class lab1A4 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int ans=a+b;
        System.out.println("Using Command Line,Sum is:"+ans);
        System.out.println("Enter First Number:");
        Scanner num= new Scanner(System.in);
        int c= num.nextInt();
        System.out.println("Enter Second Number:");
        int d= num.nextInt();
        int answer=c+d;
        System.out.println("Using Scanner Class,Sum is:"+answer);
    }
}
