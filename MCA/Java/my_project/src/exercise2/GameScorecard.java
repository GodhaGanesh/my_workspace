package exercise2;

public class GameScorecard {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {15, 18, 30, 35, 60};

        int aWins = 0;
        int bWins = 0;
        int draws = 0;

        int n = A.length;

        for (int i = 0; i < n; i++) {
            if (A[i] > B[i]) {
                aWins++;
            } else if (B[i] > A[i]) {
                bWins++;
            } else {
                draws++;
            }
        }

        System.out.println("A won " + aWins + " times");
        System.out.println("B won " + bWins + " times");
        System.out.println("Draws: " + draws);
	    
	}
}
