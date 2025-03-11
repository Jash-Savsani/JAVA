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
	Student( int id_no ,int no_of_subject_registered,String[] subject_code ,double[] subject_credits ,String[] grade_obtained ,double[] greade_points){
			 this.id_no = id_no;
			 this.no_of_subject_registered = no_of_subject_registered;
			 /*this.subject_code = new String[no_of_subject_registered];
		     this.subject_credits = new double[no_of_subject_registered];
		     this.grade_obtained = new String[no_of_subject_registered];
		     this.greade_points = new double[no_of_subject_registered];*/
		     this.subject_code = subject_code;
		     this.subject_credits = subject_credits;
		     this.grade_obtained = grade_obtained;
		     this.greade_points = greade_points;
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
		int[] id_no = new int[n];
		int[] no_of_subject_registered = new int[n];
		double[] spi = new double[n];
		String[] subject_code;
		double[] subject_credits;
		String[] grade_obtained;
		double[] greade_points;
		for(int i=0;i<n;i++){
			System.out.print("\n\n\nEnter Id Number and Number of Subject Rejistered of for s["+i+"]: ");
			id_no[i] = sc.nextInt();
			no_of_subject_registered[i]=sc.nextInt();
			subject_code = new String[no_of_subject_registered[i]];
			subject_credits = new double[no_of_subject_registered[i]];
			grade_obtained = new String[no_of_subject_registered[i]];
			greade_points = new double[no_of_subject_registered[i]];
			System.out.print("For Student s["+i+"]\n");
			for(int j=0;j<no_of_subject_registered[i];j++){
			System.out.print("Enter sub["+j+"] subject code : ");
			subject_code[j]=sc.next();
			System.out.print("Enter sub["+j+"] subject credit : ");
			subject_credits[j]=sc.nextDouble();
			System.out.print("Enter sub["+j+"] Grade :");
			grade_obtained[j]=sc.next();
			if(grade_obtained[j].equals("A++")){
				greade_points[j]=10.0;
			}
			else if(grade_obtained[j].equals("A+")){
				greade_points[j]=9.0;
			}
			else if(grade_obtained[j].equals("A")){
				greade_points[j]=8.0;
			}
			else if(grade_obtained[j].equals("B+")){
				greade_points[j]=7.0;
			}
			else if(grade_obtained[j].equals("B")){
				greade_points[j]=6.0;
			}
			else if(grade_obtained[j].equals("C")){
				greade_points[j]=5.0;
			}
			else if(grade_obtained[j].equals("P")){
				greade_points[j]=4.0;
			}
			else if(grade_obtained[j].equals("FT") || grade_obtained[j].equals("FP") || grade_obtained[j].equals("F")){
				greade_points[j]=0.0;
			}	
				s[i] = new Student( id_no[i] , no_of_subject_registered[i], subject_code , subject_credits , grade_obtained , greade_points);	
			}
			System.out.print("\nSPI for Student s["+i+"] is : "+s[i].calculate_spi()); 
		}
	}
}