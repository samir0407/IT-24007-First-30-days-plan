
package loaddate;


    
    
    import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.util.Scanner;

public class UserRegistration1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get user's birthdate
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String birthdateInput = scanner.nextLine();

        // Parse the input string into a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        // Define the output format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");

        // Format the birthdate using the defined formatter
        String formattedBirthdate = birthdate.format(formatter);

        // Display the result
        System.out.println("Hello " + name + "! Your birthdate is: " + formattedBirthdate);

        // Show example of ZoneId
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId dhakaZone = ZoneId.of("Asia/Dhaka");

        System.out.println("Example Time Zone IDs:");
        System.out.println("New York Zone: " + newYorkZone);
        System.out.println("London Zone: " + londonZone);
        System.out.println("Bangladesh Zone: " + dhakaZone);

        // Close the scanner
        scanner.close();
    }
}


