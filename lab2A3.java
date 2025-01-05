import java.util.Scanner;

public class lab2A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Ractangle:");
        int a=sc.nextInt();
        System.out.print("Enter Width of Ractangle:");
        int b=sc.nextInt();
        int ans=a*b;
        System.out.println(ans);
    }
}