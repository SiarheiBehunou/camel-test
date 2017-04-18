package test;

import org.apache.camel.spring.Main;

/**
 * //TODO class description
 * <p/>
 * Copyright (C) 2017 copyright.com
 * <p/>
 * Date: Mar 31, 2017
 *
 * @author Siarhei_Behunou
 */
public class CamelTest {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("spring-context.xml");
        main.run();
    }
}
