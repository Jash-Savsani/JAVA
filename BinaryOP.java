class BinaryOP {
	public static void main(String[] args){
		int a = -1;
		System.out.println("a>>16="+Integer.toBinaryString(a>>16));
		System.out.println("a>>>16="+Integer.toBinaryString(a>>>16));
		System.out.println("a>>1="+(a>>1));
		System.out.println("a>>>1="+(a>>>1));
	}
}