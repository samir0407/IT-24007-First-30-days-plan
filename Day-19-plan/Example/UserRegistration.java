
package loaddate;

  
    import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String birthdateInput = scanner.nextLine();

        
        LocalDate birthdate = LocalDate.parse(birthdateInput);

     
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");

       
        String formattedBirthdate = birthdate.format(formatter);

      
        System.out.println("Hello " + name + "! Your birthdate is: " + formattedBirthdate);

     
        scanner.close();
    }
}

    
