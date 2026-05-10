
package loaddate;

    
    
    import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample1 {
    public static void main(String[] args) {
        // Current date and time in New York
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date and Time in New York: " + newYorkTime);

        // Current date and time in London
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("Current Date and Time in London: " + londonTime);

        // Current date and time in Dhaka (Bangladesh)
        ZonedDateTime dhakaTime = ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));
        System.out.println("Current Date and Time in Dhaka: " + dhakaTime);
    }
}


