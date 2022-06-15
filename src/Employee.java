public class Employee {
     String firstname;
     String lastname;
     Date birthdate;
     Date hiredate;

    public Employee(String firstname, String lastname, Date birthdate, Date hiredate){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.hiredate = hiredate;
    }

    public String toString(){
        return String.format("%s %s%nBirthdate: %sHiredate: %s", firstname,lastname,birthdate,hiredate);
    }
}
