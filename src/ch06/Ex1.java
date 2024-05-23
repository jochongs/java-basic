package ch06;

public class Ex1 {
    public static void main(String[] args) {
        Tv tv = new Tv();

        tv.power();

        System.out.println("tv.getPower() = " + tv.power);

        tv.channelUp();
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int channel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}
