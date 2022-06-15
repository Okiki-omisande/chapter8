public class Time2test {
    public static void main(String[] args) {
        Time2 time1 = new Time2();
        Time2 time2 = new Time2(14);
        Time2 time3 = new Time2(3,45);
        Time2 time4 = new Time2(12,59,59);

        System.out.println("Constructed with: ");
        displayTime("all object set to defaults",time1);
        displayTime("hours specified, minute and second set to default",time2);
        displayTime("hours and minutes specified", time3);
        displayTime("all object specified", time4);

        try {
            Time2 time5 = new Time2(89,23,56);
            displayTime(" ", time5);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n", e);
        }


    }
    public static void displayTime(String header, Time2 clock){
        System.out.printf("%s%nUniversal time: %sStandard time: %s%n",header, clock.UniversalString(), clock);
    }
}
