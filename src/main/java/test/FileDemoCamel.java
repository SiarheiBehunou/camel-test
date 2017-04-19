package test;

/**
 * //TODO class description
 * <p/>
 * Copyright (C) 2017 copyright.com
 * <p/>
 * Date: Apr 18, 2017
 *
 * @author Siarhei_Behunou
 */

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;

public class FileDemoCamel extends Main {
    public static void main(String[] args) throws Exception {
        FileDemoCamel main = new FileDemoCamel();
        main.enableHangupSupport();
        main.addRouteBuilder(createRouteBuilder());
        main.run(args);
    }
    static RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("stream:in")
                        .to("file://target/output?fileName=test.txt&fileExist=append");
            }
        };
    }
}
