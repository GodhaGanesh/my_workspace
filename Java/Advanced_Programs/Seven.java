class Seven{
	public static void main(String[] args){
		for (int i = 1; i<=5; i++) {
			for (int j = 1; j<=5; j++) {
				if(i==1||i==5||i+j==6){
					System.out.print(j+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}