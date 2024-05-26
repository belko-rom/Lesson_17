import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Function<String, Double> convertDollars = str -> {
            double exchangeRate = 3.25; // курс обмена валют
            String[] parts = str.split(" ");
            double amount = Double.parseDouble(parts[0]); // извлечь сумму
            return amount / exchangeRate; // перевести сумму в доллары
        };

        String input = "420 BYN";
        double amountInDollars = convertDollars.apply(input);
        System.out.println("Сумма в долларах: " + amountInDollars);
    }
}
