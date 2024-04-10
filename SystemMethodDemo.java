/**
 * Show the hour.
 * 
 * @author (L)
 */

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SystemMethodDemo {
    
    public static void main (String[] args){
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        
        Clock clock = Clock.system(zoneId);
        
        Instant instant = clock.instant();
        
        ZonedDateTime time = instant.atZone(clock.getZone());
        
        System.out.println("Instant for class is " + time);
    
    }
}
