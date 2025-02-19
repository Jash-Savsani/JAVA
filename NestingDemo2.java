import java.util.Scanner;
//program-2: Static Nested class
class Aout{
static private int a=100;
int b=500;
public Aout(){
System.out.println("aout constructor");
}
static class BIn{//non-static nested class
int b=20;
public BIn(){
System.out.println("BIn constructor");
}
public void add1(int a,int b){
System.out.println("BIn:a+b="+(a+b)); //1+2=3
System.out.println("a+this.b="+(a+this.b));//1+300=301
}
}
}
public class NestingDemo2 {
public static void main(String[] args) {
Aout a1=new Aout();//call outer class constructor
Aout.BIn b1=new Aout.BIn();//call constructor of inner class
b1.b=300;//set value for var of inner class
b1.add1(1,2);//calling method of inner class
}
}