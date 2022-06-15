public class Time {
    int hours;
    int minutes;
    int seconds;

    public void setTime(int hours, int minutes, int seconds) {
        if (hours < 0 || hours >= 24 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Hours,minutes or seconds is invalid");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String UniversalString(){
        return String.format("%02d:%02d:%02d%n",hours, minutes, seconds);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s%n",((hours == 0 || hours == 12)? 12 : hours % 12),minutes,seconds,
                ((hours < 12) ? "AM" : "PM"));
    }
}