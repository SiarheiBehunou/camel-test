package test;

import com.sun.syndication.feed.synd.SyndFeed;
import org.apache.camel.Body;
import java.util.Random;

public class RssFilter {
    public boolean filter(@Body SyndFeed feed) {
        Random r = new Random();
        boolean result = r.nextBoolean();
        return result;
    }
}
