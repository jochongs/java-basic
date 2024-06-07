package ch10;

import java.util.Calendar;

public class Ex1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        System.out.println("Year: " + today.get(Calendar.YEAR));
        System.out.println("Month: " + today.get(Calendar.MONTH));
        System.out.println("Date: " + today.get(Calendar.DATE));

        System.out.println("Hour: " + today.get(Calendar.HOUR));
        System.out.println("Minute: " + today.get(Calendar.MINUTE));
        System.out.println("Second: " + today.get(Calendar.SECOND));

        System.out.println(today.toString());

        System.out.println(today.get(Calendar.DAY_OF_WEEK));

        String[] days = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

        System.out.println(days[today.get(Calendar.DAY_OF_WEEK)]);
    }
}
