class MatrixPrinter{
	public static void displayMatrix(char ch, int m, int n){
		if (m>0&&n>0) {
			for (int i = 0; i<m; i++) {
				System.out.println();
				for (int j = 0; j<n; j++) {
					System.out.print(" "+ch+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		displayMatrix('A',3,5);
		System.out.println("...................................");
		displayMatrix('X',6,6);
		System.out.println("...................................");
		displayMatrix('E',-2,0);
		System.out.println("...................................");
	}
}