import java.util.*;

public class elo {

    // Create player class
    static class Player {
        int L, R, increase;

        public Player(int L, int R, int increase) {
            this.L = L;
            this.R = R;
            this.increase = increase;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner sc = new Scanner(System.in);

        // Get players and starting elo
        int n = sc.nextInt();  // number of players
        int x = sc.nextInt();  // initial elo
        Player[] players = new Player[n];

        // Create a list of players
        for (int i = 0; i < n; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int increase = sc.nextInt();
            players[i] = new Player(L, R, increase);
        }
        // Close Scanner
        sc.close();

        // Loop to gain elo until no more progress can be made
        boolean madeProgress = true;
        while (madeProgress) {
            madeProgress = false;
            for (Player player : players) {
                // Check if elo is within the interval
                if (x >= player.L && x <= player.R) {
                    // Increase elo and set madeProgress to true
                    x += player.increase;
                    madeProgress = true;
                }
            }
        }

        // Output the maximum elo 
        System.out.println(x);
    }
}
