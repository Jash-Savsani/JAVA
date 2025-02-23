class Wrap{
	public static void main(String[] args) {
		int x = Integer.parseInt("123");
		System.out.println(x);
		Integer i1 = Integer.valueOf("1000011",2);//first parameter: Any Number ,  second parameter : it's base  
		
		int z = i1.intValue();
		System.out.println(z);

		Double x1 = Double.valueOf("56");
		double y = x1.doubleValue(); 
		System.out.println(y);
	}
}