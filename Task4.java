
// TAsk 4 to conver Currency 
import java.util.HashMap;
import java.util.Scanner;

public class Task4 {

    // Hard-coded exchange rates
    private static final HashMap<String, Double> exchangeRates = new HashMap<>();

    static {
        // Example exchange rates
        // Due to non availability of free api's we did it using statically
        // we putted the current value of some currencies statically

        exchangeRates.put("USD_AUD", 1.30);// EX:- US dollar to Austrailian Dollar
        exchangeRates.put("AUD_USD", 0.77);
        exchangeRates.put("USD_INR", 74.85);
        exchangeRates.put("INR_USD", 0.013);
        exchangeRates.put("USD_CAD", 1.21);
        exchangeRates.put("CAD_USD", 0.82);
        exchangeRates.put("USD_HKD", 7.76);
        exchangeRates.put("HKD_USD", 0.13);

        exchangeRates.put("AUD_INR", 57.53);
        exchangeRates.put("INR_AUD", 0.017);
        exchangeRates.put("AUD_CAD", 0.93);
        exchangeRates.put("CAD_AUD", 1.07);
        exchangeRates.put("AUD_HKD", 5.97);
        exchangeRates.put("HKD_AUD", 0.17);

        exchangeRates.put("INR_CAD", 0.016);
        exchangeRates.put("CAD_INR", 60.91);
        exchangeRates.put("INR_HKD", 0.10);
        exchangeRates.put("HKD_INR", 10.63);

        exchangeRates.put("CAD_HKD", 6.39);
        exchangeRates.put("HKD_CAD", 0.16);
    }

    public static void main(String[] args) {
        HashMap<Integer, String> currencyCodes = new HashMap<>();
        // WE putted the code here for 5 famous currencies
        currencyCodes.put(1, "USD");
        currencyCodes.put(2, "AUD");
        currencyCodes.put(3, "INR");
        currencyCodes.put(4, "CAD");
        currencyCodes.put(5, "HKD");

        String fromCode, toCode;
        double amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter:");

        System.out.println("Currency converting from?");
        System.out.println(
                "1: USD (US Dollar)\t2: AUD (Australian Dollar)\t3: INR (Indian Rupee)\t4: CAD (Canadian Dollar)\t5: HKD (Hong Kong Dollar)");
        fromCode = currencyCodes.get(sc.nextInt());

        System.out.println("Currency converting to?");
        System.out.println(
                "1: USD (US Dollar)\t2: AUD (Australian Dollar)\t3: INR (Indian Rupee)\t4: CAD (Canadian Dollar)\t5: HKD (Hong Kong Dollar)");
        toCode = currencyCodes.get(sc.nextInt());

        System.out.println("Amount to convert: ");
        amount = sc.nextDouble();

        try {
            double convertedAmount = convertCurrency(fromCode, toCode, amount);
            System.out.println(amount + " " + fromCode + " = " + convertedAmount + " " + toCode);
        } catch (Exception e) {
            System.err.println("Error during conversion: " + e.getMessage());
        }

        System.out.println("Thank you for using the Currency Converter.");
        sc.close();
    }

    private static double convertCurrency(String fromCode, String toCode, double amount) throws Exception {
        String key = fromCode + "_" + toCode;

        if (!exchangeRates.containsKey(key)) {
            throw new Exception("Exchange rate not available for " + fromCode + " to " + toCode);
        }

        double exchangeRate = exchangeRates.get(key);
        return amount * exchangeRate;
    }
}
