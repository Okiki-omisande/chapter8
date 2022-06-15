public class Date {
    int months;
    int day;
    int year;

    int[] daysOfMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int months, int day, int year) {
        if (months <= 0 || months > 12) {
            throw new IllegalArgumentException("Months (" + months + ") should be between 1 - 12");
        }

        if (day <= 0 || day > daysOfMonth[months] && !(months == 2 && day == 29)) {
            throw new IllegalArgumentException("day (" + day + ") is out of bound");
        }

        if (year <= 0)
            throw  new IllegalArgumentException("year (" + year +") must be greater than 0");

        if ((months == 2 && day == 29) && !(year % 400 == 0 || (year % 4 == 0 &&  year % 100 != 0))) {
            throw new IllegalArgumentException("year (" + year + ") is not a leap year");
        }

        this.months = months;
        this.day = day;
        this.year = year;

        System.out.printf("date object constructor for date is: %s%n", this);
    }

    public void nextDay(int day, int months, int year){
        if (day > 0 && day < daysOfMonth[months]){
            ++day;
            System.out.printf("next day is %d:%d:%d%n",day,months,year);
        }

        if (day == daysOfMonth[months] && months != 12){
            day = 1;
            ++months;
            System.out.printf("next day is %d:%d:%d%n",day,months,year);
        }

      else if (day == daysOfMonth[months] && months == 12){
            day = 1;
            months = 1;
            ++year;
            System.out.printf("next day is %d:%d:%d%n",day,months,year);
        }

    }

    public String toString(){
        return String.format("%d:%d:%d%n", months, day,year);
    }
}