import java.math.BigDecimal;
import java.text.NumberFormat;
public class BigDecimals {
    public static void main(String[] args) {
        BigDecimal rate = BigDecimal.valueOf(1.05);
        BigDecimal principal = BigDecimal.valueOf(1000.0);

        System.out.printf("%s%20s%n","Year","Amount on interest");
        for (int year = 1; year <= 10; ++year){
            BigDecimal amount = principal.multiply(rate.pow(year));
            System.out.printf("%4d%20s%n",year,NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}
