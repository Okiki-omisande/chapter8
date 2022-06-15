public class TimeTest {
    public static void displayTime(String header, Time clock){
        System.out.printf("%s%nUniversal time: %sStandard time: %s%n",header, clock.UniversalString(), clock);
    }

    public static void main(String[] args) {
        Time time = new Time();
        displayTime("Initialized input:", time);

        time.setTime(11,23,54);
        displayTime("Time after been set:", time);

        try {
            time.setTime(76,87,54);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e);
        }

        displayTime("Time after setting an invalid time", time);
    }
}
