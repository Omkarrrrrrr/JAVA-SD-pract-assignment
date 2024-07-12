//Not referred in latest version of java...it is used until 1.7 version of java...after that JODA introduced new date and time api
//to increase convenience and performance


import java.util.Date;
import java.util.*;

public class DateTimeAPI1 {
    public static void main(String[] args) {

        java.util.Date dt = new java.util.Date();
        System.out.println(dt);      //Fri Jul 12 12:24:20 IST 2024  gives op in this format

        long timeInMs = dt.getTime();

        java.sql.Date dt1 = new java.sql.Date(timeInMs);
        System.out.println(dt1);       //2024-07-12

        
    }
    
}
