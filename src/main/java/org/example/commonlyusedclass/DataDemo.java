package org.example.commonlyusedclass;


import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataDemo {
    public static void main(String[] args) throws ParseException {
        /**
         * 日期
         */
        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar.getClass());
        Date date = new Date();
        System.out.println(date);
        //System.out.println(date.getTime());
        //System.out.println(EnumDemo.Constants_A.name());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.format(date);
        Date d1 = simpleDateFormat.parse("2010-10-10 20:20:20");
        System.out.println(d1);
        System.out.println(calendar);
        System.out.println(calendar.get(1));
        calendar.getTime();
        System.out.println(calendar.get(Calendar.DATE));
        myCalendar();
    }


    /**
     * 准备实现一个日历功能
     */
    static void myCalendar(){
        System.out.println("一\t二\t三\t四\t五\t六\t日");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 2,7);
        //System.out.println(calendar.get(Calendar.MONTH));
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        //(n%4 == 0 && n%100 != 0 || n%400 == 0)

        calendar.set(Calendar.DATE,1);
/*        System.out.println(calendar.get(Calendar.MONTH)+""+
                calendar.get(Calendar.DAY_OF_MONTH)+
                calendar.get(Calendar.DAY_OF_WEEK));*/
        int first_day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
        //System.out.println(first_day_of_week);
        int countDays = calendar.getActualMaximum(Calendar.DATE);
        for (int i = 1; i < 7; i++) {
            if (first_day_of_week != i+1) System.out.print("\t");
            else break;
        }
        for (int i = 1; i <=countDays; i++) {
            if (dayOfMonth == i) System.out.print("#");
            if ((first_day_of_week -2 + i) % 7 == 0) System.out.println(i);
            else System.out.print(i+"\t");
        }




    }



}
