import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        Consumer<String> convertToDollars = str -> {
            String[] parts = str.split(" ");
            double sum = Double.parseDouble(parts[0]);
            double convertedSum = sum / 3.25; // Курс белорусского рубля к доллару
            System.out.println(convertedSum + " USD");
        };

        convertToDollars.accept("100 byn");
        convertToDollars.accept("410 byn");
    }
}
