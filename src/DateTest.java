public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(3, 27, 2022);
        date.nextDay(31,12,2022);
        System.out.printf("today's date is %s%n",date);


    }
}
