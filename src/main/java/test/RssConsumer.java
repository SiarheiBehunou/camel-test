package test;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class RssConsumer {
    @Handler
    public void processMessage(@Body SyndFeed feed) throws URISyntaxException, IOException {
        SyndEntry entry = (SyndEntry) feed.getEntries().get(0);
        URL url = new URI(entry.getLink()).toURL();
        File file = new File("target/output"+url.getPath());
        System.out.println(url.getPath());
        FileUtils.copyURLToFile(url, file);
    }
}
