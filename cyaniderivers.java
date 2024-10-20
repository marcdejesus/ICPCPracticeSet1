import java.util.*;

public class cyaniderivers{
    public static void main(String[] args){
        // Initialize Scanner
        Scanner sc = new Scanner(System.in);

        // Get input
        String towers = sc.nextLine();

        // Close Scanner
        sc.close();
        
        // Initialize variables
        int maxDays = 0;
        int n = towers.length();
        int i = 0;

        // Traverse through towers to determine number of days
        while (i < n) {
            // If we find a 0, we need to count how many consecutive 0s there are
            if (towers.charAt(i) == '0') {
                int count = 0;
                // Count the length of consecutive 0s
                while (i < n && towers.charAt(i) == '0') {
                    count++;
                    i++;
                }
                // The minimum days to certify a segment of count zeros is (count + 1 / 2)
                maxDays = Math.max(maxDays, (count + 1) / 2);
            } else {
                i++; // Move to the next tower if it's already 1
            }
        }

        // Output the maximum number of days
        System.out.println(maxDays);
    
    }
}