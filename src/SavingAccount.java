
import java.text.NumberFormat;
public class SavingAccount {
    public static double annualInterestRate = 0.04;

    public SavingAccount() {
    }

    public void calculateInterest(double SavingBalance) {
        double monthlyInterest;

        System.out.printf("%s%15s%n", "Month", "InterestRate");
        for (int months = 1; months <= 12; ++months) {
            monthlyInterest = (SavingBalance * annualInterestRate) / 12;
            SavingBalance += monthlyInterest;

            System.out.printf("%5d%15s%n",months,NumberFormat.getCurrencyInstance().format(SavingBalance));
            if (months == 12)
                System.out.println();
        }
    }

    public void modifyAnnualInterestRate(double annualInterestRate){
        SavingAccount.annualInterestRate = annualInterestRate;
    }
}
