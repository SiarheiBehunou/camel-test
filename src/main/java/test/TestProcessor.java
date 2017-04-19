package test;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.net.URI;
import java.net.URL;

public class TestProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Message message = exchange.getIn();
        SyndFeed feed = message.getBody(SyndFeedImpl.class);
        SyndEntry entry = (SyndEntry) feed.getEntries().get(0);
        message.setBody(new StringBuilder().append(entry.getTitle()).append("\n").append(entry.getLink()).append("\n"));
        URI uri = new URI(entry.getLink());
        URL url = new URL(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getPath());
        URL url1 = new URL(entry.getUri());
        File file = new File(new StringBuilder().append(exchange.getExchangeId()).append(".html").toString());
        FileUtils.copyURLToFile(url1, file);
    }
}
