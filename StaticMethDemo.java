//This is lecture program for 17/02/2025 [just for Reference]
//Static Method Concept
import java.util.Scanner;
class MyNewClass{
int a,b;
void add3(int a,int b){//diff class non-static meth
System.out.println("add3:"+(a+b));
}
static void add4(int a,int b){//diff class static meth
System.out.println("add4:"+(a+b));
}
}
public class StaticMethDemo{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 no.");
int a=sc.nextInt();
int b=sc.nextInt();
StaticMethDemo sm=new StaticMethDemo();
sm.add1(a,b);//static meth can't call non-static w/o obj
add2(a, b);//static meth can call other static meth w/o obj
MyNewClass nc=new MyNewClass();
nc.add3(a, b);//call diff class non-static meth with obj
MyNewClass.add4(a,b);//call static meth of diff cl with class reference
}//main
void add1(int a,int b){//same class non-static meth
System.out.println("add1:"+(a+b));
}//add1
static void add2(int a,int b){//same class static meth
System.out.println("add2:"+(a+b));
}
}