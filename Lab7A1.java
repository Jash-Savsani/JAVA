/*Declare a class called Student having following data members:id_no, 
no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. Define constructor and calculate_spi methods. 
Define main to instantiate an array for objects of class student to process data 
of n students to be given as command line arguments.*/
import java.util.Scanner;
class Student{
	static int NumCount=0;
	int id_no;
	int no_of_subject_registered;
	String[] subject_code;
	double[] subject_credits;
	String[] grade_obtained;
	double[] greade_points;
	double spi; 
	Student(int id_no,int no_of_subject_registered){
		Scanner sc = new Scanner(System.in);
		this.id_no=id_no;
		this.no_of_subject_registered=no_of_subject_registered;
		subject_code = new String[no_of_subject_registered];
		subject_credits = new double[no_of_subject_registered];
		grade_obtained = new String[no_of_subject_registered];
		greade_points = new double[no_of_subject_registered];
		double spi;
		System.out.println("For s["+NumCount+"] Student:");
		for(int i=0;i<no_of_subject_registered;i++){
			System.out.print("Enter sub["+i+"] subject code : ");
			subject_code[i]=sc.next();
			System.out.print("Enter sub["+i+"] subject credit : ");
			subject_credits[i]=sc.nextDouble();
			System.out.print("Enter sub["+i+"] Grade :");
			grade_obtained[i]=sc.next();
			if(grade_obtained[i].equals("A++")){
				greade_points[i]=10.0;
			}
			else if(grade_obtained[i].equals("A+")){
				greade_points[i]=9.0;
			}
			else if(grade_obtained[i].equals("A")){
				greade_points[i]=8.0;
			}
			else if(grade_obtained[i].equals("B+")){
				greade_points[i]=7.0;
			}
			else if(grade_obtained[i].equals("B")){
				greade_points[i]=6.0;
			}
			else if(grade_obtained[i].equals("C")){
				greade_points[i]=5.0;
			}
			else if(grade_obtained[i].equals("P")){
				greade_points[i]=4.0;
			}
			else if(grade_obtained[i].equals("FT") || grade_obtained[i].equals("FP") || grade_obtained[i].equals("F")){
				greade_points[i]=0.0;
			}
		}//for loop
		NumCount++;
	}//constructor
	public double calculate_spi(){
		double ci_sum=0.0 ;
		double ci_gi_multi=0.0;
		for(int i=0;i<this.no_of_subject_registered;i++){
			ci_sum=ci_sum+subject_credits[i];
			ci_gi_multi=ci_gi_multi+(subject_credits[i] * greade_points[i]);
		}
		double spi= (ci_gi_multi / ci_sum);  
		return spi;
	}
}
class Lab7A1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		Student[] s = new Student[n];
		for(int i=0;i<n;i++){
			System.out.print("\n\n\nEnter Id Number and Number of Subject Rejistered of for s["+i+"]: ");
			s[i] = new Student(sc.nextInt(),sc.nextInt());
			System.out.print("\nSPI for Student s["+i+"] is : "+s[i].calculate_spi()); 
		}
	}
}