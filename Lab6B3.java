/*Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the 
sentence. The program should continue till user enters a word “quit”. Display the total count of each vowel for 
all sentences.*/
import java.util.Scanner;
class CountVowels{
	Scanner sc = new Scanner(System.in);
	String sentance;
	int n,a,e,i,o,u;
	char j;
	CountVowels(){
		do{
				System.out.print("\nEnter a Sentance:");
				sentance=sc.nextLine();
				n=sentance.length();
				if(sentance.equals("quit")){
					break;
				}
				a=0;
				e=0;
				i=0;
				o=0;
				u=0;
				for(int m=0;m<n;m++){
					j=sentance.charAt(m);
					if(j=='a' || j=='A'){
						a++;
					}
					else if(j=='e' || j=='E'){
						e++;
					}
					else if(j=='i' || j=='I'){
						i++;
					}
					else if(j=='o' || j=='O'){
						o++;
					}
					else if(j=='u' || j=='U'){
						u++;
					}
				}
				System.out.println("Total 'A' or 'a' in Given Sentance is: "+a);
				System.out.println("Total 'E' or 'e' in Given Sentance is: "+e);
				System.out.println("Total 'I' or 'i' in Given Sentance is: "+i);
				System.out.println("Total 'O' or 'o' in Given Sentance is: "+o);
				System.out.println("Total 'U' or 'u' in Given Sentance is: "+u);
			}while(true);
		
	}
}
class Lab6B3{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	CountVowels c1 = new CountVowels();
	}
}