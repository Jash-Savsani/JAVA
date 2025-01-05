import java.util.Scanner;

public class lab1B5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter meter:");
        float n=sc.nextFloat();
        float ans=3.28084f*n;//write f in final digit of floating value
        System.out.println("Given meter in feet is:"+ans);
    }
}
