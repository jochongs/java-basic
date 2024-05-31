package ch07;

public class Ex4 {

}

class Time {
    private int hour;
    private int minute;
    private int second;

    public int hour() {
        return hour;
    }

    public int minute() {
        return minute;
    }

    public int second() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 24) {
            throw new IllegalArgumentException(hour + " cannot be hour");
        }

        this.hour = hour;
    }
}
