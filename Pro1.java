class Pro1{
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 = s4;
		String s6 = s1;
		System.out.println(s1.equals(s4));
		System.out.println(s6==s1);
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		s1 = "Jash";
		System.out.println(s2);
		System.out.println(s3==s4);
		System.out.println(s5==s4);
		

	}
}