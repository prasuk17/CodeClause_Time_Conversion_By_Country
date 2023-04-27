package Prasuk;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Prasuk_Time_Converter {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        Calendar localTime = Calendar.getInstance();
        int hour = localTime.get(Calendar.HOUR);
        int minute = localTime.get(Calendar.MINUTE);
        int second = localTime.get(Calendar.SECOND);
        int year = localTime.get(Calendar.YEAR);
        log(TimeZone.getAvailableIDs());
        System.out.println("Enter your requiered Timezone");
        String s= sc.nextLine();
        System.out.printf("Local time: %02d:%02d:%02d %02d\n", hour, minute, second, year);
        Calendar indiaTime = new GregorianCalendar(TimeZone.getTimeZone(s));
        indiaTime.setTimeInMillis(localTime.getTimeInMillis());
        hour = indiaTime.get(Calendar.HOUR);
        minute = indiaTime.get(Calendar.MINUTE);
        second = indiaTime.get(Calendar.SECOND);
        year = indiaTime.get(Calendar.YEAR);
        System.out.printf("Timezone time: %02d:%02d:%02d %02d\n", hour, minute, second, year);
        
        
    }
    private static void log(String[] availableIDs) {
        System.out.println("\nSelect your required TimeZone:");
        for (String stri : availableIDs) {
            System.out.println(stri);
        }
    }
}