
package loaddate;


    
    
    import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
      
        ZonedDateTime zonedNow = ZonedDateTime.now();
        
      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        
       
        String formattedDateTime = zonedNow.format(formatter);
        
        System.out.println("Current date and time with zone: " + formattedDateTime);
    }
}


