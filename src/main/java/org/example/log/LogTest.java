package org.example.log;


//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class LogTest {
    //log4j
    //private static final Logger LOGGER1 = Logger.getLogger(LogTest.class);
    //slf4
    //private final static Logger logger = LogManager.getLogger(LogTest.class);


    private static final Logger LOGGER1 = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        //LOGGER.info("This is info log");
        //LOGGER.error("This is error log");
        LOGGER1.info("This is info log");
        new LogTest().test();
        List<String> list = new ArrayList<>();
        list.add("a");
        try {
            for (String s : list) {
                list.remove(s);
            }
        }catch (Exception e){
            LOGGER1.error("456", e);
        }


    }
    void test(){
        try{
            int a = 5/0;
        }catch (Exception e) {
            //LOGGER1.error(e.getMessage(), e);
            e.printStackTrace();
            LOGGER1.error("123", e);

        }

    }
}
