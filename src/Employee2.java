public class Employee2 {
    private static int count;
    private String firstname;
    private String lastname;

    public Employee2(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        ++count;

        System.out.printf("Employee object constructor is: %s %s count = %d%n",firstname, lastname, count);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public static int getCount() {
        return count;
    }
}
