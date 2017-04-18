package test;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

/**
 * //TODO class description
 * <p/>
 * Copyright (C) 2017 copyright.com
 * <p/>
 * Date: Apr 18, 2017
 *
 * @author Siarhei_Behunou
 */
public class TestProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Message message = exchange.getIn();
        SyndFeed feed = message.getBody(SyndFeedImpl.class);
        SyndEntry entry = (SyndEntry) feed.getEntries().get(0);
        String title = entry.getTitle();
    }
}
