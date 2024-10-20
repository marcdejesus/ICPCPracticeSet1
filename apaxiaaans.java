import java.util.*;
public class apaxiaaans{
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner sc = new Scanner(System.in);

        // Get input from user
        String input = sc.nextLine();

        // Close Scanner
        sc.close();

        // Input length
        int n = input.length();

        // Print first letter
        System.out.print(input.charAt(0));

        // Iterate through the input and check for unique characters
        for (int i = 1; i < n; i++) {
            // Check if current character is unique, print if true
            if (input.charAt(i) != input.charAt(i-1)) {
                System.out.print(input.charAt(i));
            }
            
        }

    }
}
