public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount();
        SavingAccount saver2 = new SavingAccount();

        System.out.println("Saver1:");
        saver1.calculateInterest(2000.0);

        System.out.println("Saver2:");
        saver2.calculateInterest(3000.0);

        saver1.modifyAnnualInterestRate(0.05);

        System.out.println("Saver1:");
        saver1.calculateInterest(2000.0);

        System.out.println("Saver2:");
        saver2.calculateInterest(3000.0);
    }
}
