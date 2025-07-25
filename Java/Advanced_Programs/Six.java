class Six{
	public static void main(String[] args){
		int col = 7,row = 3;
		for (int i = 0; i<col; i++) {
			for (int j = 0; j<row; j++) {
				if ((i+j)%2==0) {
					System.out.print("1 ");
				}
				else{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}