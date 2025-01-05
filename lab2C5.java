import java.util.Scanner;

public class lab2C5 {
    public static void main(String[] args){
        int a,b,c;
        Scanner num= new Scanner(System.in);
        System.out.print("Enter First Number:");
        a= num.nextInt();
        System.out.print("Enter Second Number:");
        b= num.nextInt();
        System.out.print("Enter Third Number:");
        c= num.nextInt();
        if(a>b && a>c){
            System.out.print(a+" is Greater.");
        }
        else if(b>c){
            System.out.print(b+" is Greater.");
        }
        else{
            System.out.print(c+" is Greater.");
        }
    }
}
