import java.util.*;
//Program1: non-static nested class
class Aout{
static private int a=100;//inner class can access private member
Aout(){
System.out.println("Aout constructor");
BIn b1=new BIn();
b1.add1();
}
class BIn{//non-static nested class
int b=20;
BIn(){
System.out.println("BIn constructor");
}
void add1(){
System.out.println("BIn:a+b="+(a+b)); inner class can access private member
}
}
}
public class NestingDemo {
public static void main(String[] args) {
Aout a1=new Aout();
//BIn b1=new BIn();//unknown class:can't access inner class
}
}