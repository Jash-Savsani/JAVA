import java.util.Scanner;
class StudentH{
String name;
int age;
int sem;
String branch;
String uni;
StudentH(String name,int age){
this.name=name;
this.age=age;
this.sem=2;
this.branch="BSCSH";
this.uni="DU";
}
StudentH(StudentH sh,String nm1,int age1){//copy constructor
this.name=nm1;
this.age=age1;
this.sem=sh.sem;
this.branch=sh.branch;
this.uni=sh.uni;
}
void displayH(){
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("sem="+sem);
System.out.println("branch="+branch);
System.out.println("uni="+uni);
}
}
public class CopyDemo2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter name & age for s1:");
StudentH sh1=new StudentH(sc.next(),sc.nextInt());
System.out.print("Enter name & age for s2:");
StudentH sh2=new StudentH(sh1,sc.next(),sc.nextInt());
sh1.displayH();
sh2.displayH();
}
}