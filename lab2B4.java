import java.util.Scanner;

public class lab2B4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Feranhit:");
        int f=sc.nextInt();
        int c=(f-35*5/9);
        System.out.print("Calculate in Celsius:"+c);
    }

}
