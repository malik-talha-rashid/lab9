package L9_Assn1;

public class ClockExtended extends Clock{
    public String meridian;
    public int h = getHour();

    public ClockExtended(int hour,int minute,int seconds){
        super(hour, minute, seconds);
    }
    public int convertTo12Hour(){
        h = (((h+11)%12)+1);
        meridian = h < 12 ?"AM" : "PM";
        return h;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("\nTime in 12 hour format: \t" + convertTo12Hour() + ":" + getMinute() + ":" + getSeconds() + " " + meridian);
    }
}
}
