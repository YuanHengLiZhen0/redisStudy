package main.java.circleQueue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author zwht
 *
 */
public class DateUtils {
    private static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String now() {
        LocalDateTime time = LocalDateTime.now();
        return time.format(DateTimeFormatter.ofPattern(DEFAULT_PATTERN));
    }

    public static String plusSeconds(int seconds) {
        LocalDateTime time = LocalDateTime.now();
        time.plusSeconds(seconds);
        return time.format(DateTimeFormatter.ofPattern(DEFAULT_PATTERN));
    }
}
