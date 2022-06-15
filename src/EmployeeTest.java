public class EmployeeTest {
    public static void main(String[] args) {
        Date birthdate = new Date(2,29,2004);
        Date hiredate = new Date(2,3,2023);
        Employee employee = new Employee("Omisande", "Okiki", birthdate,hiredate);
        System.out.println(employee);
    }
}
