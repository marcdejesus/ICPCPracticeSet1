import java.util.*;
public class datum {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        int day, month, year;
        year = 2009;
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Parse the input string into day and month
        String[] date = input.split(" ");
        day = Integer.parseInt(date[0]);
        month = Integer.parseInt(date[1]);
        
        // Get day of week using Calendar class
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Print the day of week
        System.out.println(days[dayOfWeek - 1]);
    }
}
