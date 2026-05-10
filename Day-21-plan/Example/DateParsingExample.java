
package loaddate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsingExample {
    public static void main(String[] args) {
        
        String dateString = "2025-01-23";

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        
        LocalDate date = LocalDate.parse(dateString, formatter);

       
        System.out.println("Parsed date: " + date);
    }
}
  

