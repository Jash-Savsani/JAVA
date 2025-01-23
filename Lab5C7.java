import java.util.*;
class Lab5C7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements in Array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter a["+i+"]:");
			a[i]=sc.nextInt();
		} 		
		System.out.print("Enter pivot index:");//k=pivot index
		int k = sc.nextInt();
		int j=0;
		for(int i=k;i<a.length;i++){
			b[j++]=a[i];
		}
		for(int i=0;i<k;i++){
			b[j++]=a[i];
		}
		for(int i=0;i<b.length;i++){
			System.out.println("b["+i+"]:"+b[i]);	
		}
		System.out.print("Enter Element of Final Array:");
		int f=sc.nextInt();
		for(int i=0;i<b.length;i++){
			if(f==b[i])
			{
				System.out.print("index of"+b[i]+"is :"+i);
				break;
			}
		}
		
	}
}