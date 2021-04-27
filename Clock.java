package L9_Assn1;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;

    public Clock(int hour,int minute,int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSeconds() {
        return seconds;
    }
    public void display(){
        System.out.println("The time is: \t" + hour + ":" + minute + ":" + seconds);
    }
}

