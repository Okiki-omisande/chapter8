public class Employee2test {
    public static void main(String[] args) {
        System.out.printf("Employee count before instantiation = %d%n%n", Employee2.getCount());

        Employee2 e1 = new Employee2("Omisande", "Okiki");
        Employee2 e2 = new Employee2("Adebayo", "Barakat");

        System.out.println("\nEmployee count after two Employee object have been added");
        System.out.printf("e1 object count: %d%n",e1.getCount());
        System.out.printf("e2 object count: %d%n",e2.getCount());
        System.out.printf("%nFirst employee details:%n%s %s",e1.getFirstname(), e1.getLastname());
        System.out.printf("%nSecond employee details:%n%s %s", e2.getFirstname(),e2.getLastname());
    }
}
