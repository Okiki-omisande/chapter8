public class Time2 {
    int hours;
    int minutes;
    int seconds;

    public Time2(){
        this(0,0,0);
    }

    public static int tick(int seconds){
        if (seconds >= 0 && seconds <= 59)
            ++seconds;

        if (seconds == 59)
             seconds = 0;

        return seconds;
    }
    public static int incrementMinutes(int minutes){
        if (minutes >= 0 && minutes <= 59)
            ++minutes;

        if (minutes == 59)
            minutes = 0;


        return minutes;
    }

    public static int incrementHours(int hours){
         return ++hours;
    }

    public Time2(int hours){
        this(hours,0,0);
    }

    public Time2(int hours, int minutes){
        this(hours,minutes,0);
    }

    public Time2(int hours, int minutes, int seconds){
        if (hours < 0 || hours > 23)
         throw  new  IllegalArgumentException("hours should between 0-23");

        if (minutes < 0 || minutes > 59)
            throw new IllegalArgumentException("minutes should be between 0-60");

        if(seconds < 0 || seconds > 59)
            throw new IllegalArgumentException("seconds should be between 0-60 ");


        if (seconds == 59 || tick(seconds) == 59){
            incrementMinutes(minutes);
            seconds = 0;
        }

        if (minutes == 59 || incrementMinutes(minutes) == 59){
          incrementHours(hours);
           minutes = 0;
           seconds = 0;
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;


    }
    public Time2(Time2 time){
        this(time.getHours(), time.getMinutes(), time.getSeconds());
    }

    public void setTime(int hours, int minutes, int seconds) {
        if (hours < 0 || hours >= 24 || minutes < 0 || minutes > 60 || seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException("Hours,minutes or seconds is invalid");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }


    public String UniversalString(){
        return String.format("%02d:%02d:%02d%n",(minutes == 59) ? incrementHours(hours) : hours,
                ((seconds == 60) ? incrementMinutes(minutes) : minutes),
                ((seconds == 60) ? 0 : tick(seconds)));
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s%n", ((hours == 0 || hours == 12) ? 12 : hours % 12),
                ((seconds == 60) ? incrementMinutes(minutes) : minutes),  ((seconds == 60) ? 0 : tick(seconds)),
                ((hours < 12) ? "AM" : "PM"));
    }
}
