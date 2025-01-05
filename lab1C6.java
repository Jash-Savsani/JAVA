import java.util.Scanner;

public class lab1C6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Character:");
        String a = sc.next();
        if(a.equals("A")||a.equals("E")||a.equals("I")||a.equals("O")||a.equals("U"))
        {
            System.out.println("Given charcter "+a+" is Vowel.");
        }
        else
        {
            System.out.println("Given charcter "+a+" is Constant.");
        }
    }
}
