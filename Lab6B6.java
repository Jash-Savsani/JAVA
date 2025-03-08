/*WAP that counts the number of objects created using static.*/
class ObjCount{
	static int count=0;/*static variable e ghana obj banavo to pan ekaj var memory ma jagya roke che, 
	tatha teni memory obj sathe nahi but class sathe bound rahe che.*/ 
	ObjCount()
	{
		this.count++;
	}
}
class Lab6B6{
	public static void main(String[] args) {

		ObjCount o1 = new ObjCount();
		ObjCount o2 = new ObjCount();
		ObjCount o3 = new ObjCount();
		ObjCount o4 = new ObjCount();
		ObjCount o45 = new ObjCount();
		ObjCount o15= new ObjCount();
		ObjCount o14= new ObjCount();
		ObjCount o17= new ObjCount();
		/*ObjCount o5= new ObjCount();
		ObjCount o6= new ObjCount();
		ObjCount o145 = new ObjCount();*/
		System.out.print("Total Number of Object in Given Class is: "+ObjCount.count);
	}
}