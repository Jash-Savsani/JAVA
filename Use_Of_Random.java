class Use_Of_Random{
	public static void main(String[] args) {
		System.out.print("Here We Generate Numbers Between 0-50:\n");
		int n;
		for(int i=0; i<200; i++){
			n=(int)(Math.random()*100);
			if(n>=0 && n<=50){
				System.out.println(n);
			}
		}
	}
}