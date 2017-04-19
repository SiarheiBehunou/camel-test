package test;

import com.sun.syndication.feed.synd.SyndFeed;
import org.apache.camel.Body;
import java.util.Random;

/**
 * //TODO class description
 * <p/>
 * Copyright (C) 2017 copyright.com
 * <p/>
 * Date: Apr 19, 2017
 *
 * @author Siarhei_Behunou
 */
public class RssFilter {
    public boolean filter(@Body SyndFeed feed) {
        Random r = new Random();
        boolean result = r.nextBoolean();
        return result;
    }
}
