package org.example.log;


//import org.apache.log4j.Logger;
import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

public class LogTest {
    //log4j
    //private static final Logger LOGGER = Logger.getLogger(LogTest.class);
    //slf4
    private static final Logger LOGGER1 = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        //LOGGER.info("This is info log");
        //LOGGER.error("This is error log");
        LOGGER1.info("This is info log");
        try{
            int a = 5/0;
        }catch (Exception e) {
            LOGGER1.debug("this is debug log", e);
        }
    }

}
