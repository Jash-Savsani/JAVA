class StudH1{
	String name;
	int roll;
	static String uni;//static variable
	StudH1(String name, int roll, String uni){
		this.name=name;
		this.roll=roll;
		this.uni=uni;
	}
	void display1(){
		System.out.println(name+"\t"+roll+"\t"+uni);
	}
}
public class StaticVarDemo{
	public static void main(String[] args){
		StudH1 s1 = new StudH1("abc",111,"DU");
		StudH1 s2 = new StudH1("pqr",222,"DU");
		StudH1 s3 = new StudH1("xyz",333,"DU");
		s3.name="zzz";
		StudH1.uni="Darshan";/*Class Ref and Obj Ref both are correct but Class Ref most Preferable.*/
		s1.uni="Darshan";
		s2.uni="Darshan";
		s3.uni="Darshan";
		s1.display1();
		s2.display1();
		s3.display1();
	}
}