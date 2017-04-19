package test;

import org.apache.camel.spring.Main;

public class CamelTest {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("spring-context.xml");
        main.run();
    }
}
