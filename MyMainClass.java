//Java program for an Array using all functions with Method and Object
import java.util.Scanner;
class MyArrMeth{
void displayArr(int[] a){//meth-1
for(int i=0;i<a.length;i++){
System.out.println("a["+i+"]:"+a[i]);
}
}//meth-1------------
int[] bubbleSort(int[] a){//meth-2 bubble
int temp;
for(int i=0;i<a.length;i++){
for(int j=0;j<a.length-1;j++){
if(a[j]>a[j+1]){
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
return a;
}//meth-2 bubble sort------------
int searchArr(int[] a,int ele){//linear search
int i=0;
for(i=0;i<a.length;i++){
if(a[i]==ele){
return i;
}
}
return -1;
}//meth-3
int sumArr(int[] a){//meth-4------------
int sum=0;
for(int i=0;i<a.length;i++){
	sum+=a[i];
}
return sum;
}//meth-4
double avgArr(int[] a){//meth-4------------
double avg=0.0;
int sum=0;
for(int i=0;i<a.length;i++)
{
	sum+=a[i];
}
avg=(double)sum/a.length;
return avg;
}//meth-4
}
public class MyMainClass {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int[] a=new int[5];
System.out.println("len="+a.length);
for(int i=0;i<a.length;i++){
System.out.print("enter a["+i+"]:");
a[i]=sc.nextInt();
}
MyArrMeth arm=new MyArrMeth();
arm.displayArr(a);//call meth-1
//bubble sort
arm.bubbleSort(a);//call meth-2
System.out.println("bubble sort:");
arm.displayArr(a);//call meth-1
//search
System.out.print("enter a element to search:");
int ele=sc.nextInt();
int index=arm.searchArr(a, ele);//call meth-3
System.out.println(ele+" found at index:"+index);
int sum=arm.sumArr(a);//call meth-4
System.out.println("Sum of All array elements is = "+sum);
double avg=arm.avgArr(a);
System.out.println("Average of array is = "+avg);
}
}