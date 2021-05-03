package org.example.commonlyusedclass;


import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class DataDemo {
    public static void main(String[] args) {
        /**
         * 日期
         */
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        System.out.println(date.getTime());

    }
}
